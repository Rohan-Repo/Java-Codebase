package in.easysystems.generics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;

public class GenericsClassEg_2 {
    public static void main(String[] args) {

        Printer_Generic num = new Printer_Generic( 123 );
        System.out.println("num = " + num);

        Printer_Generic dbl = new Printer_Generic( 123.45 );
        System.out.println("dbl = " + dbl);

        Printer_Generic name = new Printer_Generic( "John Wick" );
        System.out.println("name = " + name);

        Printer_Generic arrList = new Printer_Generic( Arrays.asList( "Chandler Bing", "Joey Tribbiani", "Phoebe Buffay","Ms. Chanandler Bong", "Ken Addams", "Regina Philange") );
        System.out.println("arrList = " + arrList);

        HashMap<LocalDate,String> userInfo = new HashMap<>();
        userInfo.put( LocalDate.of(1941,9,9),"Dennis Ritchie" );
        userInfo.put( LocalDate.of(1955,5,19),"James Gosling" );
        userInfo.put( LocalDate.of(1956,1,31),"Guido van Rossum" );
        userInfo.put( LocalDate.of(1960,12,2),"Anders Hejlsberg" );

        Printer_Generic hashMap = new Printer_Generic( userInfo );
        System.out.println("hashMap = " + hashMap);

    }
}
