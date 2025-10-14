package in.easysystems.generics;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassEg {
    // Convert Primitive DataType wraps into a Java Wrapper Class Object
    // We need them because Data Structures would use Wrapper Classes and primitive data-types are not allowed
    // It Supports synchronization in a MultiThreaded environment



    public static void main(String[] args) {
        Integer n1 = new Integer( 123 );
        System.out.println("n1 = " + n1);

        Integer n2 = Integer.valueOf( 456 );
        System.out.println("n2 = " + n2);

        // AutoBoxing : Automatic conversion of primitive data type to it's corresponding Wrapper class Eg. int to Integer or boolean to Boolean
        // Here internally the primitive data type int will be converted to it's corresponding Wrapper class Integer
        System.out.println( "AutoBoxing:" );
        int n3 = 789;
        System.out.println("n3 = " + n3 + " Type : " + Integer.TYPE );
        Integer n4 = n3;
        System.out.println("n4 = " + n4 + " Type : " + n4.getClass().getSimpleName() );


        // Unboxing : Automatic conversion of a Wrapper Class Object to it's corresponding primitive type Eg. Integer to int or Boolean to boolean
        // Here Internally the Wrapper Class object Integer gets converted into a primitive data type int
        System.out.println( "UnBoxing:" );
        int n5 = n1;
        System.out.println("n1 = " + n1 + " Type : " + n1.getClass().getSimpleName() );
        System.out.println("n5 = " + n5 + " Type : " + Integer.TYPE );
        int n6 = Integer.valueOf( n2 );
        System.out.println("n2 = " + n2 + " Type : " + n2.getClass().getSimpleName() );
        System.out.println("n6 = " + n6 + " Type : " + Integer.TYPE );

        // Not Allowed - ArrayList<int> numList = new ArrayList<int>();
        System.out.println( "In Collections we can store only Primitive Types" );
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add( 123 );
        numList.add( 456 );
        numList.add( 789 );

        System.out.println("numList = " + numList);
        numList.forEach( num -> System.out.println( num + " Type : " + num.getClass().getSimpleName() ));
    }
}
