package in.easysystems.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// When we want an Object to use different DataTypes we use Generics
// A Class, Interface or a method that operates on a parameterized object is a generic entity
// Eg. the same ArrayList class works with Integers, Strings, Doubles by passing appropriate values
public class GenericsClassEg_1 {

    public static void main(String[] args) {

        Animal_Nrml dog1 = new Animal_Nrml( "Woof!" );
        dog1.animalSays();

        Animal_Nrml cat1 = new Animal_Nrml( "Meow!" );
        cat1.animalSays();

        Animal_Generic<Integer, String> dog2 = new Animal_Generic<>( 1, "Woof!" );
        System.out.println("dog2 = " + dog2);
        System.out.println( "DataType of dog2 ID = " + dog2.getAnimalID().getClass() );

        Animal_Generic<Double, String> cat2 = new Animal_Generic<>( 2.5, "Meow!" );
        System.out.println("cat2 = " + cat2);
        System.out.println( "DataType of cat2 ID = " + cat2.getAnimalID().getClass() );

        Animal_Generic<UUID, List<String> > parrot = new Animal_Generic<>( UUID.randomUUID(), List.of("Hello", "Hi") );
        System.out.println("parrot = " + parrot);
        System.out.println( "DataType of Parrot ID = " + parrot.getAnimalID().getClass() );
        System.out.println( "DataType of Parrot Sound = " + parrot.getAnimalSound().getClass().getSimpleName() );
        System.out.println( "Value of Parrot Sound #0 = " + parrot.getAnimalSound().get(0) );
        System.out.println( "Value of Parrot Sound #1 = " + parrot.getAnimalSound().get(1) );

        // Add Generic Values in an ArrayList
        ArrayList<Animal_Generic> generics = new ArrayList<>();
        generics.add( dog2 );
        generics.add( cat2 );
        generics.add( parrot );

        System.out.println("generics = " + generics);
    }
}
