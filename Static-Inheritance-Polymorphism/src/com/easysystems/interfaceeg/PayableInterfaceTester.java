package com.easysystems.interfaceeg;

public class PayableInterfaceTester {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[4];

        // Populate Array with Objects that implement Payable's getPayableAmount() method
        payableObjects[0] = new Invoice( "12345", "Seat", 2, 375 );
        payableObjects[1] = new Invoice( "67890", "Tire", 4, 79.95 );
        payableObjects[2] = new SalariedEmployeeInterfaceObj( "John", "Smith",
                "111-11-1111", 800 );
        payableObjects[3] = new SalariedEmployeeInterfaceObj( "Lisa", "Barnes",
                "888-88-8888", 1200 );

        // Process each element in the payableObjects Array
        System.out.println( "Invoices and Employees processed Polymorphically:" );
        for ( Payable currentPayable: payableObjects ) {
            System.out.println( "Class Name = " + currentPayable.getClass().getSimpleName() );
            System.out.println( "Values = " + currentPayable );
        }

    }
}
