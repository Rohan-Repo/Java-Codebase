package com.easysystems.methodoverloadingoverridingeg;

public class MethodOverridingExample {

    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println( "Interest Rate of " + bank.getClass().getSimpleName() + " = " + bank.getRateOfInterest() );

        RBC rbc = new RBC();
        System.out.println( "Interest Rate of " + rbc.getClass().getSimpleName() + " = " + rbc.getRateOfInterest() );

        CIBC cibc = new CIBC();
        System.out.println( "Interest Rate of " + cibc.getClass().getSimpleName() + " = " + cibc.getRateOfInterest() );

        ScotiaBank scotiaBank = new ScotiaBank();
        System.out.println( "Interest Rate of " + scotiaBank.getClass().getSimpleName() + " = " + scotiaBank.getRateOfInterest() );
    }

}
