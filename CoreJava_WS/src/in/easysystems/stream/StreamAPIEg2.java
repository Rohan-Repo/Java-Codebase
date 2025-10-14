package in.easysystems.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPIEg2 {
    public static void main(String[] args) {

        // .range() - Similar to Python End not inclusive
        // .skip - Skip certain values
        System.out.println( "Stream of Numbers between 10 and 50 and skip the first 20 numbers so 30-50");
        IntStream
                .range( 10, 50 )
                .skip( 20 )
                .forEach( num -> System.out.print(" , " + num) );

        System.out.println( "\n ");

        System.out.println( "Sum of Numbers between 1 and 10: " +
            IntStream
                .range( 1, 11 )
                .sum()
        );

        System.out.println( "Sum of Even Numbers between 1 and 10: " +
                IntStream
                        .range( 1, 11 )
                        .filter( num -> num%2==0 )
                        .sum()
        );

        System.out.println( "Average of Squares of Odd Numbers between 1 and 10: " +
                IntStream
                        .range( 1, 11 )
                        .filter( num -> num%2!=0 )
                        .map( num -> num * num )
                        .average()
        );

        List<Integer> sqrOddNums =
                IntStream
                        .range( 1, 11 )
                        .filter( num -> num%2!=0 )
                        .map( num -> num * num )
                        .boxed() // Convert IntStream → Stream<Integer>
                        .collect(Collectors.toList());

        System.out.println( "List of Squares of Odd Numbers between 1 and 10: " + sqrOddNums );

        List<Integer> cubeEvenNums =
                IntStream
                        .range( 1, 11 )
                        .filter( num -> num%2==0 )
                        .map( num -> num * num * num )
                        .boxed() // Convert IntStream → Stream<Integer>
                        .collect(Collectors.toList());

        System.out.println( "List of Cubes of Even Numbers between 1 and 10: " + cubeEvenNums );

        System.out.println("Sum of Cubes of Even Numbers between 1 and 10  = " +
                cubeEvenNums.stream().reduce( 0, (Integer n1, Integer n2) -> n1+n2 )
        );
        // Sum set to 0 first and then do a cumulative sum of the numbers

        System.out.println("Average of Squares of Odd Numbers between 1 and 10  = " +
                sqrOddNums.stream().reduce( 0, (Integer n1, Integer n2) -> n1+n2 )/sqrOddNums.size()
        );

        List<Integer> numList = new ArrayList<>();

        // Run a ForEach to Combine Data from both List into a Single List
        sqrOddNums.forEach( num -> numList.add(num) );
        cubeEvenNums.forEach( num -> numList.add(num) );

        System.out.println("numList = " + numList);

        // Step 1 - Convert a List to a Stream
        // Step 2 - Convert that Stream into an IntStream
        // Step 3 - Apply Summary Statistics
        // summaryStatistics similar to describe function of pandas

        IntSummaryStatistics summaryStatistics =
                numList
                        .stream()
                        .mapToInt( Integer::intValue )
                        .summaryStatistics();

        System.out.println("summaryStatistics = " + summaryStatistics);
    }
}
