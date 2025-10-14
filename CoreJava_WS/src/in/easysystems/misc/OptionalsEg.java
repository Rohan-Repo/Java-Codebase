package in.easysystems.misc;

import in.easysystems.pojos.PersonRecord;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

// For Objects that may or May not contain a Value we use optionals
public class OptionalsEg {
    public static void main(String[] args) {
        List<PersonRecord> people = List.of(
                new PersonRecord(LocalDate.of(1941, 9, 9), "Dennis Ritchie"),
                new PersonRecord(LocalDate.of(1955, 5, 19), "James Gosling"),
                new PersonRecord(LocalDate.of(1956, 1, 31), "Guido van Rossum"),
                new PersonRecord(LocalDate.of(1960, 12, 2), "Anders Hejlsberg")
        );

        System.out.println("people = " + people);

        // Optional should be Empty but never null
        Optional<PersonRecord> personToFind_1 = findPerson("Dennis Ritchie", people);
        Optional<PersonRecord> personToFind_2 = findPerson("Jane Doe", people);

        System.out.println( "\n OrElse");
        System.out.println( "Dennis Ritchie Present :" + personToFind_1.map( PersonRecord::age ).orElse( -1 ) );
        System.out.println( "Jane Doe Absent :" + personToFind_2.map( PersonRecord::age ).orElse( -1 ) );

        System.out.println( "\n .isPresent()");
        System.out.println("Dennis Ritchie .isPresent() = " + personToFind_1.isPresent() );
        System.out.println("Jane Doe .isPresent() = " + personToFind_2.isPresent() );

        System.out.println( "\n .isEmpty()");
        System.out.println("Dennis Ritchie .isEmpty() = " + personToFind_1.isEmpty() );
        System.out.println("Jane Doe .isEmpty() = " + personToFind_2.isEmpty() );

        System.out.println( "\n If present Print Data otherwise print User not found .ifPresentOrElse() :" );
        personToFind_1.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("User not found") );

        personToFind_2.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("User not found") );

        System.out.println( "Throw a NoSuchElementException: No value present if User is not found .orElseThrow():");
        System.out.println( "Person 1 Found: " + personToFind_1.orElseThrow() );
        System.out.println( "Person 2 Not Found NoSuchElementException Thrown: " );
        personToFind_2.orElseThrow();
    }

    private static Optional<PersonRecord> findPerson(String nameToSearch, List<PersonRecord> people) {

        /* Instead pf ForEachLoop we use the Stream
        for (var user : people) {
            if (user.name().equalsIgnoreCase(nameToSearch))
                return Optional.of(user);
            // instead of return user
        }

        // If Person not found then return empty Optional
        return Optional.empty();
        // instead of return null

        */

        // Using Stream
        return people
                .stream()
                .filter( p -> p.name().equalsIgnoreCase(nameToSearch) )
                .findAny();

    }
}