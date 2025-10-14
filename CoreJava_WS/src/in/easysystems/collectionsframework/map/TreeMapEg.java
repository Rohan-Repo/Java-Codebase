package in.easysystems.collectionsframework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEg {
    public static void main(String[] args) {

        // Stores Key-Value Pairs and the Key's are Unique
        // TreeMap internally runs a BST and ensures the Keys get sorted
        Map<String, String> currencyMap = new TreeMap<>();

        currencyMap.put( "Canada", "CAD" );
        currencyMap.put( "India", "INR" );
        currencyMap.put( "USA", "US Dollar" );
        currencyMap.put( "England", "GBP" );
        currencyMap.put( "United Arab Emirates", "AED" );
        currencyMap.put( "Kuwait", "KWD" );

        System.out.println("1 = " + currencyMap);

        // If Key Exists it overwrites
        currencyMap.put( "USA", "USD" );
        System.out.println("2 = " + currencyMap);

        // If we want to avoid overwriting - putIfAbsent
        currencyMap.putIfAbsent( "USA", "US Dollar" );
        System.out.println("3 = " + currencyMap);

        System.out.println("Map Keys = " + currencyMap.keySet() );
        System.out.println("Map Values = " + currencyMap.values() );

        System.out.println("Canada Key Exists = " + currencyMap.containsKey("Canada") );
        System.out.println("Australia Key Exists = " + currencyMap.containsKey("Australia") );

        System.out.println("USD Value Exists = " + currencyMap.containsValue("USD") );
        System.out.println("AUD Value Exists = " + currencyMap.containsValue("AUD") );

        // Australia goes to the Head as it starts with A - Sorted Value
        currencyMap.putIfAbsent( "Australia", "AUD" );
        System.out.println("4 = " + currencyMap);

        // remove an Object
        currencyMap.remove( "USA" );
        System.out.println("5 = " + currencyMap);

    }
}
