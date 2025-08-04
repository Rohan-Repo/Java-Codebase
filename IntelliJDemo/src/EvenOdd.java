import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] nums = {1,-6,19,30,31,12,98};
        int[] evenNums = new int[5];
        int[] oddNums = new int[5];
        int i=0, j=0;

        for (int n : nums ) {
            if( n%2 == 0 )
                evenNums[i++] = n;
            else
                oddNums[j++] = n;
        }

        System.out.println( "Nums : " + Arrays.toString(nums) );
        System.out.println( "Evens : " + Arrays.toString(evenNums) );
        System.out.println( "Odds : " + Arrays.toString(oddNums) );
    }
}
