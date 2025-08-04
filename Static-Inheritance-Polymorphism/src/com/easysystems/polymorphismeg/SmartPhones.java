package com.easysystems.polymorphismeg;

public class SmartPhones extends MobilePhones {
    public void canCall(){
        System.out.println( "SmartPhones have a Calling functionality" );
    }
    public boolean hasInternet(){
        return true;
    }
    public boolean hasApps(){
        return true;
    }
}
