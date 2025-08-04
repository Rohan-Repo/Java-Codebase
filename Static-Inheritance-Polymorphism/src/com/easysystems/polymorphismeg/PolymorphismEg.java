package com.easysystems.polymorphismeg;

public class PolymorphismEg {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        System.out.println("+ as Integer-String Concatenation  = " + num1 + num2 );
        System.out.println("+ as addition  = " + (num1 + num2) );

        String city = "Toronto", province = "Ontario", country = "Canada";
        System.out.println("+ as String Concatenation  = " + (city + "," + province + "," + country) );
    }
}
