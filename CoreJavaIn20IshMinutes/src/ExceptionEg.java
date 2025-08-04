public class ExceptionEg {
    public static void main(String[] args) {

        // Compile-time exceptions will be something which will be thrown at compile-time
        // Run-time exceptions like here - Programatically everything is great but it will have an error at runtime

        int arr[] = {1,2,3};

        // System.out.println( arr[5] );

        try
        {
            System.out.println( arr[5]);
        } catch ( ArrayIndexOutOfBoundsException ae ){
            System.out.println( "Invalid Index Entered" );
        }

        checkNullString( null );
        checkNullString( "Hello" );
    }

    public static void checkNullString( String str3 ){

        if( str3 != null ) {
            System.out.println( str3.length() );
        } else {
            System.out.println( "IF - String is Null" );
        }

        try {
            System.out.println( str3.length() );
        } catch ( NullPointerException ne ){
            System.out.println( "Exception - String is Null" );
        }

    }
}
