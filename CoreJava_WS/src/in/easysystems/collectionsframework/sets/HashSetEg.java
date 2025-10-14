package in.easysystems.collectionsframework.sets;

import java.util.*;

public class HashSetEg {
    public static void main(String[] args) {

        // Let's Create a list of Languages
        // Unordered Set of Unique Values
        List<String> languagesKnown = new ArrayList<>();

        languagesKnown.addAll(Collections.nCopies(3, "C"));
        languagesKnown.addAll(Collections.nCopies(5, "Java"));
        languagesKnown.addAll(Collections.nCopies(4, "SQL"));
        languagesKnown.addAll(Collections.nCopies(2, "Python"));

        System.out.println("As a ArrayList Duplicates Allowed = " + languagesKnown);

        Set<String> progLang = new HashSet<>();
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
    }
}
