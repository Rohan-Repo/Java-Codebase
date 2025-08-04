package org.example;


import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class ArrayValueTest {

    int[] numArr = { 42, -3, 15 };

    // For tests we don't need Access Specifiers

    @Test( expected = ArrayIndexOutOfBoundsException.class )
    public void checkNotArrayLimit(){
        System.out.println("Arrays.toString( numArr )  = " + Arrays.toString( numArr ) );
        System.out.println( numArr[7] );
    }
}
