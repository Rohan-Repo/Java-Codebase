package com.easysystems.polymorphismeg;

public class CallerIDPhones extends Landline{

    public void canCall(){
        System.out.println( "CallerIDPhones had a Calling functionality" );
    }

    public boolean hasScreen(){
        return true;
    }

}
