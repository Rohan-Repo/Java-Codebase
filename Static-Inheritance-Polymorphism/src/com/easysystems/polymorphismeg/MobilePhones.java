package com.easysystems.polymorphismeg;

public class MobilePhones extends CallerIDPhones {
    public void canCall(){
        System.out.println( "MobilePhones had a Calling functionality" );
    }

    public boolean isPortable(){
        return true;
    }
}
