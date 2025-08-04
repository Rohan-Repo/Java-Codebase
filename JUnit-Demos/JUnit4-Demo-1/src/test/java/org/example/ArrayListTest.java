package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    @Test
    public void testAddGet(){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add( 42 );
        arrList.add( -3 );
        arrList.add( 15 );

        System.out.println("arrList = " + arrList );

        Assert.assertEquals( 42, arrList.get(0).intValue() );
        Assert.assertEquals( -3, arrList.get(1).intValue() );
        Assert.assertEquals( 15, arrList.get(2).intValue() );
    }

    @Test
    public void testIsEmpty(){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Assert.assertTrue( arrList.isEmpty() );
        arrList.add( 123 );
        Assert.assertFalse( arrList.isEmpty() );
        arrList.remove( 0 );
        Assert.assertTrue( arrList.isEmpty() );
    }
}
