public class FunctionEg {
    public static void main(String[] args) {
        // Remove Redundancy in Code
        // Conditionals & Functions
        boolean validForVoting = false;
        int age1 = 21;
        int age2 = 15;

        if( age1 >= 18 )
            validForVoting = true;

        System.out.println( "Person with age : " + age1 + " is allowed to Vote :" + validForVoting );

        validForVoting = false;

        if( age2 >= 18 )
            validForVoting = true;

        System.out.println( "Person with age : " + age2 + " is allowed to Vote :" + validForVoting );

        // Remove Redundancy - Can be used to avoid repetitive tasks by creating functions
        System.out.println( "Fun-> Person with age : " + age1 + " is allowed to Vote :" + isPersonAllowedToVote(age1) );
        System.out.println( "Fun-> Person with age : " + age2 + " is allowed to Vote :" + isPersonAllowedToVote(age2) );

        // Defined the method but didn't call so didn't get Output
        // sayHello();

        System.out.println( "PI Value: " + Math.PI );
        System.out.println( "Min between 10 & 5 is : " + Math.min(10,5) );
        System.out.println( "Max between 12.8 & 1.2 is : " + Math.max(12.8,1.2) );
        System.out.println( "Square Root of 625 : " + Math.sqrt(625) );

        // Method Overloading
        System.out.println( "Square of 9 is : " + squareNum(9) );
        System.out.println( "Square of 1.2 is : " + squareNum(1.2) );

        System.out.println( "Addition of 12 and 20 = " + addNums( 12,20) );
        System.out.println( "Addition of 1.2, 1.5,4.5 = " + addNums(1.2,1.5,4.5) );

    }

    // Function Definition
    public static boolean isPersonAllowedToVote(int age) {
        if( age >= 18 )
            return true;
        else
            return false;
    }

    public static void sayHello() {

        System.out.println( "Hello From sayHello()" );
    }

    public static int squareNum( int n1 ){
        return n1*n1;
    }

    public static double squareNum( double n1 ){
        return n1*n1;
    }

    public static int addNums( int n1, int n2 ){
        return n1+n2;
    }

    public static double addNums( double n1, double n2, double n3 ){
        return n1+n2+n3;
    }


}
