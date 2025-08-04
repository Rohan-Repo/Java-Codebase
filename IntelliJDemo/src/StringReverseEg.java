public class StringReverseEg {
    public static void main(String[] args) {

        String origStr = "Lorem ipsum dolor sit amet";

        // Way 1 : Use Built-in functions
        System.out.println( "Original String #1: " + origStr );
        System.out.println( "Reversed String #1: " + new StringBuilder(origStr).reverse() );

        // Way 2 : Traverse as a Char Array
        char[] strCharArr = origStr.toCharArray();

        System.out.println( "Original String #2: " + origStr );
        System.out.print( "Reversed String #2: " );
        for( int i=(origStr.length()-1); i>=0; i--)
            System.out.print( strCharArr[i] );

        System.out.println();

        // Way 3 : charAt() function
        System.out.println( "Original String #3: " + origStr );
        System.out.print( "Reversed String #3: " );
        for( int i=(origStr.length()-1); i>=0; i--)
            System.out.print( origStr.charAt(i) );

    }
}
