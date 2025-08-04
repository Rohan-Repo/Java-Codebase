import java.util.Scanner;

public class ConditionalEg {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter Number:" );
        int num = scanner.nextInt();

        if( num > 0 && num != 1 )
            System.out.println( "Whole Number" );
        else if ( num == 1 )
            System.out.println( "1 is neither prime nor composite" );
        else
            System.out.println( "Negative Number" );


        System.out.print( "Enter Age:" );
        int age = scanner.nextInt();

        if( age >= 18 )
            System.out.println( "Person with age : " + age + " is eligible to Vote" );
        else
            System.out.printf( "Person with age : %d is Not eligible to Vote \n", age );

        System.out.println( "Ternary Operator Example:");
        System.out.println( age>=18 ? "Eligible" : "Not Eligible" );

        /*
            TAX Slabs:
            < 10K - No tax
            Between 10K and 50K - 20%
            Between 50K and 70K - 30%
            Between 70K and 100K - 40%
            100K + - 50%
         */
        System.out.print( "Enter Salary:" );
        int salary = scanner.nextInt();
        float taxAmount = 0;
        float grossSalary = 0;

        if( salary <= 10000 )
            System.out.println( "No Tax for you!" );
        else if (salary > 10000 && salary <= 50000 )
            taxAmount = salary * 20 / 100;
        else if (salary > 50000 && salary <= 70000 )
            taxAmount = salary * 30 / 100;
        else if (salary > 70000 && salary <= 100000 )
            taxAmount = salary * 40 / 100;
        else
            taxAmount = salary * 50 / 100;;

        grossSalary = salary - taxAmount;

        System.out.println( "Salary Entered = " + salary );
        System.out.println( "Tax Amount = " + taxAmount );
        System.out.println( "Final Salary = " + grossSalary );

//        Basic Difference between Python Switch Case & Java Switch case - No auto break statement
        System.out.print( "Enter Day:" );
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println( "Monday");
                break;

            case 2:
                System.out.println( "Tuesday");
                break;

            case 3:
                System.out.println( "Wednesday");
                break;

            case 4:
                System.out.println( "Thursday");
                break;

            case 5:
                System.out.println( "Friday");
                break;

            case 6:
                System.out.println( "Saturday");
                break;
            case 7:
                System.out.println( "Sunday");
                break;
            default:
                System.out.println( "Invalid Day Entered");
                break;

        }




    }
}
