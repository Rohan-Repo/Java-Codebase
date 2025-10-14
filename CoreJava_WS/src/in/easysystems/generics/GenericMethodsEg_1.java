package in.easysystems.generics;

import java.util.ArrayList;

public class GenericMethodsEg_1 {
    public static void main(String[] args) {
        printData( 123 );
        printData( 4.5 );
        printData( "John Wick" );

        ArrayList<String> namesList = new ArrayList<>();
        namesList.add( "Chandler Bing" );
        namesList.add( "Joey Tribbiani" );

        printData( namesList );

    }

    static void printData( int num ){
        System.out.println("1-num = " + num);
    }

    static void printData( double num ){
        System.out.println("2-num = " + num);
    }

    static void printData( String name ){
        System.out.println("3-name = " + name);
    }

    static void printData( ArrayList<String> list ){
        System.out.println("4-list = " + list);
    }

}
