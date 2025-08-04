import java.util.Arrays;
import java.util.Scanner;

public class RPGLoanCalculator {

    public static void checkCounter( int count ) throws Exception {
        if( count < 2 )
            throw new Exception( "Exception - Invalid Loan Count Entered \n GoodBye!!" );
        else
            System.out.println( "Loan Count is correct" );
    }

    public static void checkSameLoan( int[] loanArray ) throws Exception {
        boolean sameFlag = false;

        for (int i = 0; i < loanArray.length; i++) {
            if (loanArray[i] == -99)
                break;
            else {
                for (int j = 0; j < loanArray.length; j++) {
                    if (loanArray[i] == loanArray[j])
                        throw new Exception("Exception - Same Loan Type Entered.. \n GoodBye!!");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.println( "RPG LOAN PROVIDERS Loan System! " );

        System.out.print( "Enter User-Name:" );
        String name = input.next();

        System.out.print( "\nEnter Family Income:" );
        int familyIncome = input.nextInt();

        if( familyIncome >= 80000 ){
            System.out.println( "Eligible to Get Loan!" );

            int operation = 0, count = 0;

            int[] operationArray = { -99, -99,-99,-99,-99,-99 };

            do{
                System.out.println( "\n Select Loan-Type:\n " );
                System.out.println( "Loan-Type \t\t Interest-Rate" );
                System.out.println( "1. Home Loan \t\t 4.2%" );
                System.out.println( "2. Car Loan \t\t 3.9%" );
                System.out.println( "3. Gold Loan \t\t 5.2%" );
                System.out.println( "4. Study Loan \t\t 2.8%" );
                System.out.println( "5. Business Loan \t 5.8%" );
                System.out.println( "6. EXIT!!" );

                operation = input.nextInt();

                if( count == 6 )
                    break;

                if( operation != 6 && count != 6 )
                    operationArray[ count++ ] = operation;

            }while( operation != 6 );

            try {
                System.out.println( "Operations-Count = " + count );
                System.out.println( "Loan-Types Entered: " + Arrays.toString(operationArray) );

                checkCounter( count );

                checkSameLoan( operationArray );

                int monthlyInstallmentCount = 0;
                double loanAmount = 0;

                String[] loanTypeArray = {"Home Loan", "Car Loan", "Gold Loan", "Study Loan", "Business Loan" };
                double[] interestArray = { 4.2, 3.9, 5.2, 2.8, 5.8 };

                double interestRate = 0;
                double interestValue = 0;
                double totalLoanAmount;
                double installmentPerMonth = 0;

                for (int i = 0; i < 5; i++) {

                    if( operationArray[i] != -99 ) {

                        System.out.println( "\n For Loan Type : " + loanTypeArray[ operationArray[i]-1 ] + "\n" );
                        System.out.println( "Enter Count of Monthly Installments:" );
                        monthlyInstallmentCount = input.nextInt();

                        if( monthlyInstallmentCount >= 6 && monthlyInstallmentCount <= 60 ) {

                            System.out.println( "Enter the Loan Amount:" );
                            loanAmount = input.nextDouble();

                            interestRate = interestArray[ operationArray[i]-1 ];

                            if( loanAmount >= 500000 )
                                interestRate = interestRate - 0.10;

                            // SI - PNR/100 - N in years
                            interestValue = Math.round( (loanAmount * (monthlyInstallmentCount/12.0) * interestRate)/100.0 );

                            totalLoanAmount = Math.round( loanAmount + interestValue );

                            installmentPerMonth = Math.round( totalLoanAmount/monthlyInstallmentCount );

                            System.out.println( "For User : " + name);
                            System.out.println( "Loan-Amount = " + loanAmount );
                            System.out.println( "Interest-Rate = " + interestRate );
                            System.out.println( "Total Interest Payable = " + interestValue );
                            System.out.println( "Total Loan Amount Payable = " + totalLoanAmount );
                            System.out.println( "Monthly Installment = " + installmentPerMonth );

                        } else {
                            System.out.println( "Invalid Monthly Installment Count Entered.." );
                        }
                    }
                }
        }catch ( Exception e ) {
//            e.printStackTrace();
            System.out.println( e.getMessage() );
        }

    } else {
        System.out.println( "You are not eligible to get the loan from RPG Loan Providers." );
    }

}
}
