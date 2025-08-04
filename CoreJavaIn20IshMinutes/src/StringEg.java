public class StringEg {
    public static void main(String[] args) {
        String str = "Toronto, Ontario, Canada";

        System.out.println( "String-Length = " + str.length() );
        System.out.println( "String-LowerCase = " + str.toLowerCase() );
        System.out.println( "Position of W = " + str.indexOf("R") );

        String[] strSplit = str.split( " " );
        System.out.println( "Number of Splits = " + strSplit.length );
        for (String s : strSplit ) {
            System.out.println( s );
        }

        str = str.concat(",Toronto,ON" );
        System.out.println( "Concatenated String = " + str );

        String str2 = "Hello";

        for( int i=0; i<str2.length(); i++ ){
            System.out.println( Character.isLetter(str2.charAt(i)) );
        }

        String numStr1 = "12.5";
        System.out.println( 1 + numStr1 ); // String Concatenation
        double num1 = Double.parseDouble( numStr1 );
        System.out.println( 1 + num1 ); // Addition

        checkifStrPalindrome( "Madam" );
        checkifStrPalindrome( "John" );

    }

    public static String reverseString( String str ){
        String reverseString = "";

        for( int i=(str.length()-1); i>=0; i-- )
            reverseString += str.charAt(i);

        return reverseString;
    }

    public static void checkifStrPalindrome( String str ){
        String reverseString = "";

        for( int i=(str.length()-1); i>=0; i-- )
            reverseString += str.charAt(i);

        System.out.println( "Original String = " + str + " -> Reversed String = " + reverseString );

//        reverseString += reverseString.toLowerCase();
//        str += str.toLowerCase();

        if( str.equalsIgnoreCase(reverseString) )
            System.out.println( str + " Is a Palindrome" );
        else
            System.out.println( str + " Is NOT a Palindrome" );
    }
}
