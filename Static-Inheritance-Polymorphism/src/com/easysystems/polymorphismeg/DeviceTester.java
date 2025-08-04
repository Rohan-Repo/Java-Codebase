package com.easysystems.polymorphismeg;

import java.util.Arrays;

public class DeviceTester {
    public static void main(String[] args) {
        System.out.println( "For LandLine Class");
        Landline landline = new Landline();
        landline.canCall();
        System.out.println("Arrays.toString(landline.numPad) = " + Arrays.toString(landline.numPad));

        System.out.println( "\n For CallerIDPhones Class");
        landline = new CallerIDPhones();
        System.out.print( "canCall() using Landline - " );
        landline.canCall(); // overrides parent's canCall() method

        CallerIDPhones callerIDPhones = new CallerIDPhones();
        callerIDPhones.canCall();
        System.out.println( "callerIDPhones.hasScreen() = " + callerIDPhones.hasScreen() );

        System.out.println( "\n For MobilePhones Class");
        landline = new MobilePhones();
        System.out.print( "canCall() using Landline - " );
        landline.canCall(); // overrides parent's canCall() method

        MobilePhones mobilePhones = new MobilePhones();
        mobilePhones.canCall();
        System.out.println( "mobilePhones.hasScreen() = " + mobilePhones.hasScreen() );
        System.out.println("mobilePhones.isPortable()  = " + mobilePhones.isPortable() );

        System.out.println( "\n For SmartPhones Class");
        landline = new SmartPhones();
        System.out.print( "canCall() using Landline - " );
        landline.canCall();

        SmartPhones smartPhones = new SmartPhones();
        smartPhones.canCall();
        System.out.println("smartPhones.hasScreen()  = " + smartPhones.hasScreen() );
        System.out.println("smartPhones.isPortable()  = " + smartPhones.isPortable() );
        System.out.println("smartPhones.hasInternet()  = " + smartPhones.hasInternet() );

        
    }
}
