public class LoopsEg {
    public static void main(String[] args) {
        int i = 0;
        char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
        System.out.print( "\n Vowels in English Alphabets are: " );

        while( i<5 ) {
            System.out.print( vowels[i] + "," );
            i++;
        }

        int product = 3;
        System.out.print( "\n Product Values are : " + product + "," );

        while ( product <= 100 ){
            product = product * 3;
            System.out.print( product + "," );
        }

        int[] nums = {1,-6,19,30,31,12,98};
        i = 0;

        System.out.print( "\n Original Array : " );
        while ( i < nums.length ){
            System.out.print( nums[i] + "," );
            i++;
        }

        System.out.print( "\n Even Numbers from the Array are : " );

        for( i=0; i<nums.length; i++ ){
            if( nums[i] % 2 == 0 )
                System.out.print( nums[i] + "," );
        }

        System.out.print( "\n Odd Numbers from the Array are : " );

        for (int n : nums ) {
            if( n % 2 != 0 )
                System.out.print( n + "," );
        }

        int cnt = 1;

        System.out.print( "\n Do While Example: " );

        do{
            System.out.printf("%d, ", cnt );
            ++cnt;
        } while ( cnt <= 10 );


    }
}
