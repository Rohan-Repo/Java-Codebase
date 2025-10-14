package in.easysystems.collectionsframework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {
    public static void main(String[] args) {

        // Stores Key-Value Pairs and the Key's are Unique but in an unordered fashion
        Map<String, String> currencyMap = new HashMap<>();

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

        // remove an Object
        currencyMap.remove( "USA" );
        System.out.println("4 = " + currencyMap);

    }
}
