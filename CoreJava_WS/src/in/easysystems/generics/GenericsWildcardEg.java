package in.easysystems.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericsWildcardEg {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList( -12,1,99,120,45,-97,27,10,777 );
        printList( numList );

        List<String> languagesKnown = new ArrayList<>();

        languagesKnown.addAll(Collections.nCopies(3, "C"));
        languagesKnown.addAll(Collections.nCopies(5, "Java"));
        languagesKnown.addAll(Collections.nCopies(4, "SQL"));
        languagesKnown.addAll(Collections.nCopies(2, "Python"));

        printList( languagesKnown );

        List<List<String>> languagesKnown2 = new ArrayList<>();

        languagesKnown2.add(new ArrayList<>(Collections.nCopies(1, "C")));
        languagesKnown2.add(new ArrayList<>(Collections.nCopies(5, "Java")));
        languagesKnown2.add(new ArrayList<>(Collections.nCopies(4, "SQL")));
        languagesKnown2.add(new ArrayList<>(Collections.nCopies(2, "Python")));

        printList( languagesKnown2 );

        Animal_Nrml dog1 = new Animal_Nrml( "Woof!" );
        dog1.animalSays();

        Animal_Nrml cat1 = new Animal_Nrml( "Meow!" );
        cat1.animalSays();

        ArrayList<Animal_Nrml> animals = new ArrayList<>();
        animals.add( dog1 );
        animals.add( cat1 );

        printList( animals );

    }

    // ?(Wildcard) means it will dynamically take the Input at process it accordingly at Runtime
    private static void printList( List<?> listToPrint ){
        System.out.println("listToPrint = " + listToPrint + "\t Type of Data : " + listToPrint.get(0).getClass().getSimpleName() );
    }
}
