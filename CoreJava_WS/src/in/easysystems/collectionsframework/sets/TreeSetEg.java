package in.easysystems.collectionsframework.sets;

import java.util.*;

public class TreeSetEg {
    public static void main(String[] args) {

        // Let's Create a list of Languages
        // Unordered Set of Unique Values
        // TreeSet creates a Set and Tree so elements are Unique and in a Sorted Fashion
        // Internally runs a Binary Search Tree which ensures Sorted order of Elements
        List<String> languagesKnown = new ArrayList<>();

        languagesKnown.addAll(Collections.nCopies(3, "C"));
        languagesKnown.addAll(Collections.nCopies(5, "Java"));
        languagesKnown.addAll(Collections.nCopies(4, "SQL"));
        languagesKnown.addAll(Collections.nCopies(2, "Python"));

        System.out.println("As a ArrayList Duplicates Allowed = " + languagesKnown);

        Set<String> progLang = new TreeSet<>();
        progLang.addAll( languagesKnown );
        System.out.println("As a Set Duplicates Not Allowed = " + progLang);

        // Set internally checks Hash Value and if it finds a duplicate it eliminates it

        // Remove an Element
        progLang.remove("C");
        System.out.println("progLang = " + progLang);

        // Check if Element is present
        System.out.println("SQL Present = " + progLang.contains( "SQL" ) );
        System.out.println("Kotlin Present = " + progLang.contains( "Kotlin" ) );

        System.out.println("Is Set Empty = " + progLang.isEmpty() );

        List<Integer> numList = new ArrayList<>();

        numList.addAll(Collections.nCopies(2, 49));
        numList.addAll(Collections.nCopies(3, 12 ));
        numList.addAll(Collections.nCopies(5, 23 ));
        numList.addAll(Collections.nCopies(4, 37));
        numList.addAll(Collections.nCopies(7, -123));
        numList.addAll(Collections.nCopies(3, 999));

        System.out.println("As a ArrayList Duplicates Allowed = " + numList);

        Set<Integer> numSet = new TreeSet<>();
        numSet.addAll( numList );
        System.out.println("As a TreeSet so Duplicates Not Allowed and It's Sorted = " + numSet );


    }
}
