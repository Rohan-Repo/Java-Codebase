package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DateTimeoutCheck {

    LocalDate localDate = LocalDate.now();

    void getDateDetails( int year ) {

        int[] daysInMonth = new int[12];
        String[] monthsStr = new String[12];

        int j = 0;
        for( int i=1; i<=12; i++ ){
            localDate = LocalDate.of( year, i, 1 );
            daysInMonth[ j ] = localDate.lengthOfMonth();
            monthsStr[ j ] = String.valueOf( localDate.getMonth() );
            j++;
        }

        System.out.println( "For the Year = " + year );
        for (int i = 0; i < 12; i++)
            System.out.println( "# of Days in " + monthsStr[i] + " = " + daysInMonth[i] );
    }

    // @Test( timeout = 1 )
    // @Test( timeout = 5 )
    @Test( timeout = 10 )
    public void checkLeapYear(){
        int year = 2020;
        // int year = 2023;
//        getDateDetails( year );
        getDateDetails( localDate.getYear() );
        localDate = LocalDate.of( year, 2, 1);
        Assert.assertTrue( localDate.lengthOfMonth() == 29 );
    }

    @Test
    public void checkDateValue() {
        System.out.println("Current Date = " + localDate);
        localDate = localDate.plusDays(15);
        System.out.println("After 15 Days = " + localDate);
        Assert.assertEquals( 3, localDate.getMonthValue() );
    }
}
