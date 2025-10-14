package in.easysystems.methodreferences;

// Concise and Shorthand way to Using Functions - Functional Programming

import in.easysystems.pojos.PersonRecord;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferencesEg {
    public static void main(String[] args) {
        // 1. Reference to a pre-defined static Method
        List<Integer> numList = Arrays.asList( -12,1,99,120,45,-97,27,10,777 );
        System.out.println( "Static Using Lambda:" );
        numList.forEach( num -> System.out.println(num) );
        // Instead of Lambda let's use Method References
        System.out.println( "\n Static Using Method References:" );
        numList.forEach( System.out::println );

        // 2. Reference to an instance method of a particular object
        List<String> names = List.of( "Chandler Bing", "Joey Tribbiani", "Ms. Chanandler Bong", "Ken Addams" );
        Greeter greeter = new Greeter();
        System.out.println( "\n Class Using Lambda:" );
        names.forEach( name -> greeter.greetUser(name) );
        System.out.println( "\n Class Using Method References:" );
        names.forEach( greeter::greetUser );

        // 3. Reference to an instance method of an arbitrary object of a particular type
        // List.of() creates an immutable list so we use Arrays.asList()
        List<String> friends_nicknames_1 = Arrays.asList( "Chandler Bing", "Joey Tribbiani", "Phoebe Buffay","Ms. Chanandler Bong", "Ken Addams", "Regina Philange");
        System.out.println( "\n Arbitrary Using Lambda:" );
        friends_nicknames_1.sort( (f1,f2) -> f1.compareToIgnoreCase(f2) );
        System.out.println("friends_nicknames_1 = " + friends_nicknames_1);
        List<String> friends_nicknames_2 = Arrays.asList( "Chandler Bing", "Joey Tribbiani", "Phoebe Buffay","Ms. Chanandler Bong", "Ken Addams", "Regina Philange");
        System.out.println( "\n Arbitrary Using Method References:" );
        friends_nicknames_2.sort( String::compareToIgnoreCase );
        System.out.println("friends_nicknames_2 = " + friends_nicknames_2);

        // 4. Reference to a Constructor
        HashMap<LocalDate,String> userInfo = new HashMap<>();
        userInfo.put( LocalDate.of(1941,9,9),"Dennis Ritchie" );
        userInfo.put( LocalDate.of(1955,5,19),"James Gosling" );
        userInfo.put( LocalDate.of(1956,1,31),"Guido van Rossum" );
        userInfo.put( LocalDate.of(1960,12,2),"Anders Hejlsberg" );

        // Stream of entries
        Stream<Map.Entry<LocalDate, String>> entryStream = userInfo.entrySet().stream();

        System.out.println( "\n Print entries one by One : " );
        entryStream.forEach(entry ->
                System.out.println("Birthdate: " + entry.getKey() + ", Name: " + entry.getValue())
        );

        System.out.println( "\n Print Stream of Keys:" );
        Stream<LocalDate> keyStream = userInfo.keySet().stream();
        keyStream.forEach(System.out::println);

        System.out.println( "\n Print Stream of Values:" );
        Stream<String> valueStream = userInfo.values().stream();
        valueStream.forEach(System.out::println);

        System.out.println( "\n Print Entries sorted by BirthDate:" );
        userInfo.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry ->
                        System.out.println(entry.getKey() + " -> " + entry.getValue())
                );

        // Stream entries, sort by birthdate, map to formatted string, collect as List
        System.out.println( "\n Stream entries, sort by birthdate, map to formatted string, collect as List:");
        List<String> sortedList = userInfo.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())  // Sort by birthdate
                .map(entry -> entry.getValue() + "\t |" + entry.getKey() + "|")
                .collect(Collectors.toList());

        // Print the list
        sortedList.forEach(System.out::println);

        System.out.println( "\n Stream map, convert to Person record, sort by birthDate, and print:");
        userInfo.entrySet().stream()
                .map(entry -> new PersonRecord(entry.getKey(), entry.getValue())) // Map to Person
                .sorted(Comparator.comparing(PersonRecord::birthDate))     // Sort by birthDate
                .forEach(System.out::println);           // Print using method reference

    }
}
