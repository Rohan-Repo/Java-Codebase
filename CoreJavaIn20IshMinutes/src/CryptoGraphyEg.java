import java.util.UUID;

public class CryptoGraphyEg {
    static void generateUUID( int limit ){
        if( limit > 0 ) {
            for (int i = 0; i < limit; i++)
                System.out.println( UUID.randomUUID() );
        }

    }

    public static void main(String[] args) {
        generateUUID( 200 );
    }
}
