package com.easysystems.inheritanceeg;

public class BasePlusCommissionEmployeeTester {
    public static void main(String[] args) {

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee( "Brian", "Tyler",
                "222-22-2222", 100000, 0.04, 10000);

        // Get all values with Getter Methods

        System.out.println( employee );

        employee.setGrossSales( 5000000 );
        employee.setCommissionRate( 0.1 );
        employee.setBaseSalary( 20000 );

        //Second way to call toString()
        System.out.println( employee.toString() );
    }
}
