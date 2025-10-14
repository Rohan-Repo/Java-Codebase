package in.easysystems.generics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;

// With this generic method we can print any type of Data

public class GenericMethodsEg_2 {
    public static void main(String[] args) {
        printData( 123 );
        printData( 4.5 );
        printData( "John Wick" );
        printData( Arrays.asList( "Chandler Bing", "Joey Tribbiani", "Phoebe Buffay","Ms. Chanandler Bong", "Ken Addams", "Regina Philange") );

        HashMap<LocalDate,String> userInfo = new HashMap<>();
        userInfo.put( LocalDate.of(1941,9,9),"Dennis Ritchie" );
        userInfo.put( LocalDate.of(1955,5,19),"James Gosling" );
        userInfo.put( LocalDate.of(1956,1,31),"Guido van Rossum" );
        userInfo.put( LocalDate.of(1960,12,2),"Anders Hejlsberg" );

        printData( userInfo );
    }

    static <T> void printData( T data ){
        System.out.println("data = " + data + " Type : " + data.getClass().getSimpleName() );
    }
}
