import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr2 = {1,-6,19,30,31,12,98};

        int largest = 0;
        int secondLargest = 0;

        for ( int i : arr2 ) {
            if( i > largest) {
                secondLargest = largest;
                largest = i;
            }
        }

        System.out.println( "L:" + largest );
        System.out.println( "SL:" + secondLargest );
    }
}
