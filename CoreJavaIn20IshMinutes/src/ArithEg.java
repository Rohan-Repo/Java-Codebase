import java.util.Scanner;

public class ArithEg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter N1:" );
        int n1 = scanner.nextInt();
        System.out.println();

        System.out.print( "Enter N2:" );
        int n2 = scanner.nextInt();
        System.out.println();

//        System.out.println( "Addition = " + (n1+n2) );
//        System.out.println( "Subtraction = " + (n1-n2) );

        System.out.printf( "%d + %d = %d \n", n1, n2, (n1+n2) );
        System.out.printf( "%d - %d = %d \n", n1, n2, (n1-n2) );
        System.out.printf( "%d * %d = %d \n", n1, n2, (n1*n2) );
        System.out.printf( "%d / %d = %d \n", n1, n2, (n1/n2) );
        System.out.printf( "%d %% %d = %d \n", n1, n2, (n1%n2) );

        int y = 2 * 5 * 5 + 3 * 5 + 7;
        System.out.println( "Polynomial y = " + y );

        int x = 6 * 5 - 34 / 2;
        /*
            6 * 5
            = 30 - 34/2
            = 30 - 17
            = 13
         */
        System.out.println( "X: " + x );

        int z = 6 / 5 - 34 * 2;
        /*
            6 / 5
            = 0 - 34*2
            = 0 - 68
            = -67
         */
        System.out.println( "Z: " + z );

    }
}
