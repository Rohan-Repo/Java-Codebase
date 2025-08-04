package com.easysystems.inheritanceeg;

public class CommissionEmployeeTester {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee( "Cal", "Lightman", "111-11-1111", 10000, .06 );

        // Get all values with Getter Methods
        //One way to call toString()
        System.out.println( employee );

        employee.setGrossSales( 50000 );
        employee.setCommissionRate( 0.1 );

        //Second way to call toString()
        System.out.println( employee.toString() );

    }
}
