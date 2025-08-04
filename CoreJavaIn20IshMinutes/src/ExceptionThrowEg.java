public class ExceptionThrowEg {

    static void checkAge(int age) throws Exception {
        if( age >= 18 )
            System.out.println( "Allowed to Vote!" );
        else
            throw new Exception("Not allowed to Vote" );
    }

    public static void main(String[] args) {
        try {
            System.out.println( 60/12.0 );
            System.out.println( 60/12 );
            checkAge( 13 );
        } catch (Exception e ) {
            System.out.println( e.getMessage() );
            e.printStackTrace();
        }
    }
}
