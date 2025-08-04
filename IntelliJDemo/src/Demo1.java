import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter X Value:" );
        int x = scanner.nextInt();
        System.out.println();
        System.out.print( "Enter Y Value:" );
        int y = scanner.nextInt();

        String[][] arr1 = new String[x][y];

        for( int i=0; i<x; i++ ) {
            for( int j=0; j<y; j++ ) {
                arr1[i][j] = i + "," + j;
            }
        }

        System.out.println( Arrays.deepToString(arr1) );

        for (String[] sa: arr1) {
            System.out.println();
            for (String s: sa) {
                System.out.print(s);
            }
        }
        scanner.close();
    }
}
