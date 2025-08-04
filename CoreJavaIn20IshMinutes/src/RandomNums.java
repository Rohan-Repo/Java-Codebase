import java.security.SecureRandom;

public class RandomNums {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        for (int i = 1; i <= 20; i++) {

            int num = random.nextInt(10);
            System.out.print( num + " " );

//            if( i % 4 == 0 )
            if( i % 5 == 0 )
                System.out.println();
        }
    }
}
