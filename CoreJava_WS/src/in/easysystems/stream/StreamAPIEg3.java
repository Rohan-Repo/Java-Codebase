package in.easysystems.stream;

import in.easysystems.pojos.EmployeeRecord;
import in.easysystems.pojos.SalaryRanges;
import in.easysystems.pojos.TransactionRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIEg3 {

    public static void main(String[] args) {


        List<EmployeeRecord> empList = createEmpList();

        // Find Average Salary in each Department
        System.out.println( "Find Average Salary in each Department:");
        Map<String, Double> deptWiseAvgSal =
        empList
                .stream()
                .collect(
                        // Group by Dept and Calculate Average Salary
                        Collectors.groupingBy(
                                EmployeeRecord::empDept,
                                Collectors.averagingDouble(EmployeeRecord::empSal)
                        )
                );
        System.out.println("\t deptWiseAvgSal = " + deptWiseAvgSal);

        // Find Highest Salary in each Department
        Map<String, Optional<EmployeeRecord> > highestSalByDept =
                        empList
                                .stream()
                                .collect(
                                        // Group by Dept and Calculate Average Salary
                                        Collectors.groupingBy(
                                                EmployeeRecord::empDept,
                                                Collectors.maxBy(
                                                        Comparator.comparing( EmployeeRecord::empSal)
                                                )
                                        )
                                );

        System.out.println( "\n Print the highest salary employee per department:" );
        highestSalByDept.forEach((dept, emp) ->
                System.out.println( "\t" + dept + " : " + emp.orElse(null))
        );

        // Range Employees by Salary : Under 50K - LOW, 51K to 89K - Medium, 90K+ - High
        Map<SalaryRanges, List<EmployeeRecord>> empSalByRange = empList
                .stream()
                .collect(
                        Collectors.groupingBy(
                                // Group By Range
                                emp -> {
                                    if (emp.empSal() <= 50000)
                                        return SalaryRanges.LOW;
                                    else if (emp.empSal() >= 51000 && emp.empSal() <= 89000)
                                        return SalaryRanges.MEDIUM;
                                    else if (emp.empSal() >= 90000)
                                        return SalaryRanges.HIGH;
                                    else
                                        return SalaryRanges.INVALID;
                                }
                        )
                );

        System.out.println("empSalByRange = " + empSalByRange);

        System.out.println("\n Print the Salary by SalaryRange:");
        empSalByRange.forEach((salRange, empList1) -> {
            System.out.println("\t" + salRange + " :");
            empList1.forEach(emp ->
                    System.out.println( "\t\t" + emp.empName() + " : " + emp.empSal() )
            );
        });

        // Count the number of employees in each department
        Map<String, Long> empCntByDept = empList
                .stream()
                // Group by Dept and Count the users
                .collect(
                        Collectors.groupingBy(
                                EmployeeRecord::empDept,
                                Collectors.counting()
                        )
                );

        System.out.println( "\n Count the number of employees in each department:" );
        empCntByDept.forEach((dept, cnt ) ->
                System.out.println( "\t" + dept + " : " + cnt )
        );

        // Sort Employees List by Salary
        List<EmployeeRecord> empSalAscending = empList
                .stream()
                // Without giving a condition we get a ClassCastException cause it does not know what to
                // sort the objects on so we explicitly tell it use the salary for sorting
                .sorted( Comparator.comparing( EmployeeRecord::empSal))
                .toList();

        System.out.println("\n Employees Sorted in Ascending Order of Salary : " );
        empSalAscending.forEach( employeeRecord -> {
                    System.out.println( "\t" + employeeRecord.empName() + " : $" + employeeRecord.empSal() );
                });

        List<EmployeeRecord> empSalDescending = empSalAscending.reversed();
        System.out.println("\n Employees Sorted in Descending Order of Salary : " );
        empSalDescending.forEach( employeeRecord -> {
            System.out.println( "\t" + employeeRecord.empName() + " : $" + employeeRecord.empSal() );
        });

        List<TransactionRecord> transactions = createTransactionList();

        // Get Sum of Transactions Grouped by Date
        Map<LocalDate, Double> transactionSumByDate = transactions
                .stream()
                .collect(
                        // Group by extracted TransactionDate from TransactionDateTime and add the total amounts
                        Collectors.groupingBy(
                                transactionRecord -> transactionRecord.transactionDT().toLocalDate(),
                                Collectors.summingDouble(TransactionRecord::transactionAmt)
                        )
                );

        System.out.println("transactionSumByDate = " + transactionSumByDate);

        System.out.println( "\n Get Sum of Transactions Grouped by Date:" );
        transactionSumByDate.forEach((date, amt) ->
                System.out.println( "\t" + date + " : " + amt )
        );

        System.out.println( "Get Max out of the Transactions:" );
        Map.Entry<LocalDate, Double> maxValFromTransactions = transactionSumByDate
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("\t maxValFromTransactions = " + maxValFromTransactions);

        // Group Transactions by transactionType
        Map<String, Double> transactionAvgByType = transactions
                .stream()
                .collect(
                        Collectors.groupingBy(
                                TransactionRecord::transactionType,
                                Collectors.averagingDouble( TransactionRecord::transactionAmt )
                        )
                );

        System.out.println( "\n Get Average of Transactions Grouped by Transaction Type:" );
        transactionAvgByType.forEach((type, amt) ->
                System.out.println( "\t" + type + " : " + amt )
        );


    }

    public static List<EmployeeRecord> createEmpList() {

        List<EmployeeRecord> empList = List.of(
                new EmployeeRecord( 1, "Chandler Bing", "PM", 100000 ),
                new EmployeeRecord( 2, "Ms. Chanandler Bong", "PM", 90000 ),
                new EmployeeRecord( 3, "Rachel Greene", "Support", 35000 ),
                new EmployeeRecord( 4, "Ken Addams", "Support", 50000 ),
                new EmployeeRecord( 5, "Phoebe Buffay", "Testing", 85000 ),
                new EmployeeRecord( 6, "Regina Philange", "Testing", 55000 ),
                new EmployeeRecord( 7, "Monica Geller", "TeamLead", 95000 ),
                new EmployeeRecord( 8, "Monica Fellula Geller", "Developer", 45000 ),
                new EmployeeRecord( 9, "Ross Geller", "Developer", 75000 ),
                new EmployeeRecord( 10, "Joey Tribbiani", "Developer", 98000 ),
                new EmployeeRecord( 11, "Gunther Central Perk", "Sales", 82000 )
        );

        return empList;
    }

    public static List<TransactionRecord> createTransactionList() {

        Random random = new Random();

        List<TransactionRecord> transactions = List.of(
                new TransactionRecord(LocalDateTime.of(2025, 1, 1, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "Card", 900.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 1, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "Cash", 650.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 1, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "ApplePay", 1200.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 1, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "SamsungPay", 800.0),

                new TransactionRecord(LocalDateTime.of(2025, 1, 8, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "Card", 1100.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 8, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "Cash", 580.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 8, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "ApplePay", 1250.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 8, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "SamsungPay", 790.0),

                new TransactionRecord(LocalDateTime.of(2025, 1, 15, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "Card", 1300.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 15, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "Cash", 880.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 15, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "ApplePay", 1000.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 15, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "SamsungPay", 1150.0),

                new TransactionRecord(LocalDateTime.of(2025, 1, 22, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "Card", 1960.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 22, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "Cash", 1400.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 22, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "ApplePay", 1500.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 22, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "SamsungPay", 1600.0),

                new TransactionRecord(LocalDateTime.of(2025, 1, 29, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "Card", 1250.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 29, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "Cash", 600.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 29, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "ApplePay", 900.0),
                new TransactionRecord(LocalDateTime.of(2025, 1, 29, random.nextInt(24), random.nextInt(60), random.nextInt(60)), "SamsungPay", 980.0)
        );

        return transactions;
    }

}
