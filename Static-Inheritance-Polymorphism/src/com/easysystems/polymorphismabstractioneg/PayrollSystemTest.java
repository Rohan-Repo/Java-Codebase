package com.easysystems.polymorphismabstractioneg;

public class PayrollSystemTest {
    public static void main(String[] args) {
        // Create SubClass Objects

        SalariedEmployee salariedEmployee = new SalariedEmployee( "John", "Smith",
                "111-11-1111", 800 );

        HourlyEmployee hourlyEmployee = new HourlyEmployee( "Karen", "Price",
                "222-22-2222", 16.75, 40 );

        CommissionEmployeeInherited commissionEmployeeInherited = new CommissionEmployeeInherited(
                "Sue", "Jones", "333-33-3333", 10000, 0.06 );

        BasePlusCommissionEmployeeInherited basePlusCommissionEmployeeInherited = new BasePlusCommissionEmployeeInherited(
          "Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);

        System.out.println( "Employees Processed Individually:" );
        System.out.println( "Salaried Employees Details: \n" + salariedEmployee );
        System.out.println( "Hourly Employees Details: \n" + hourlyEmployee );
        System.out.println( "Commission Employees Details: \n" + commissionEmployeeInherited );
        System.out.println( "BasePlusCommission Employees Details: \n" + basePlusCommissionEmployeeInherited );

        // Check Polymorphism
        // Create a Four Element Employee Array
        Employee[] employees = new Employee[4];

        // Initialize Employee Array with the previously created Objects
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployeeInherited;
        employees[3] = basePlusCommissionEmployeeInherited;

        System.out.println( "\n Employees Processed Polymorphically:" );

        for ( Employee currentEmployee: employees ) {

            // Call toString() method
            System.out.println( currentEmployee );

            // Check if object is BasePlusCommissionEmployeeInherited Object
            if( currentEmployee instanceof BasePlusCommissionEmployeeInherited ){
                // DownCase Employee Reference to BasePlusCommissionEmployeeInherited Reference
                BasePlusCommissionEmployeeInherited employee = (BasePlusCommissionEmployeeInherited) currentEmployee;

                // Increment Salary by 10% for BasePlusCommissionEmployeeInherited Type
                double newSalary = ( employee.getBaseSalary() + (employee.getBaseSalary() * 0.1) );
                employee.setBaseSalary( newSalary );

                System.out.println( "New Increased Base Salary = " + employee.getBaseSalary() );
            }
        }

        // Get the ClassName for each Object in Employee Array
        for (int i = 0; i < employees.length; i++) {
            System.out.println( "For Employee Number : " + i );
            System.out.println( "Employee Full-Name With Package = " + employees[i].getClass().getName() );
            System.out.println( "Employee Name = " + employees[i].getClass().getSimpleName() );
        }

    }
}
