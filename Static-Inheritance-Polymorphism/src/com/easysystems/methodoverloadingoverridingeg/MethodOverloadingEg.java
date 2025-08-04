package com.easysystems.methodoverloadingoverridingeg;

public class MethodOverloadingEg {
    public static void main(String[] args) {
        System.out.println( "Square of 9 = " + squareNum(9) );
        System.out.println( "Square of 1.2 = " + squareNum(1.2) );

        System.out.println( "100+120 = " + addNums(100,120) );
        System.out.println( "1.5 + 3.7 + 4.5 = " + addNums(1.5,3.7,4.5) );
    }

    public static int squareNum( int n ){
        return n*n;
    }

    public static double squareNum( double n ){
        return n*n;
    }

    public static int addNums( int n1, int n2 ) {
        return n1+n2;
    }

    public static double addNums( double n1, double n2, double n3 ){
        return n1+n2+n3;
    }
}
