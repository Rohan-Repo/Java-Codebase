package in.easysystems.generics;

public class BoundedGenericsEg {
    public static void main(String[] args) {

        // Printer_BoundedGeneric<Integer> intNum = new Printer_BoundedGeneric<>( 123 );
        Printer_BoundedGeneric intNum = new Printer_BoundedGeneric( 123 );
        System.out.println("intNum = " + intNum);

        //Printer_BoundedGeneric<Double> dblNum = new Printer_BoundedGeneric<>( 4.5 );
        Printer_BoundedGeneric dblNum = new Printer_BoundedGeneric( 4.5 );
        System.out.println("dblNum = " + dblNum);

        // Printer_BoundedGeneric<Float> floatNum = new Printer_BoundedGeneric<>( 6.5F );
        Printer_BoundedGeneric floatNum = new Printer_BoundedGeneric( 6.5F );
        System.out.println("floatNum = " + floatNum);

        // Printer_BoundedGeneric<Long> longNum = new Printer_BoundedGeneric<>( System.currentTimeMillis() );
        Printer_BoundedGeneric longNum = new Printer_BoundedGeneric( System.currentTimeMillis() );
        System.out.println("longNum = " + longNum);

        // java: incompatible types: java.lang.String cannot be converted to java.lang.Number
        // Printer_BoundedGeneric name = new Printer_BoundedGeneric( "Hello" );

    }
}
