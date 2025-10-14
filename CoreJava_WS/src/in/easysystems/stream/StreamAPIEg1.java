package in.easysystems.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIEg1 {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList( -12,1,99,120,45,-97,27,10,777 );

        System.out.println( "List of Nums = ");
        numList.forEach( num -> System.out.print( num + " , ") );
        System.out.println("\n-x-");
        numList.forEach( num -> System.out.print( num + " , ") );

        System.out.println( "\nNums as a Stream = ");
        Stream<Integer> numStream = numList.stream();
        numStream.forEach( num -> System.out.print( num + " , ") );
        System.out.println("\n-x-");
        /* numStream.forEach( num -> System.out.print( num + " , ") );
         An Exception raised - java.lang.IllegalStateException: stream has already been operated upon or closed
        This is great because if we have a huge amount of Data it gets eligible for Garbage collection once used
        No unused resources, data remains open */

        System.out.println( "\nNumbers Sorted = ");
        Stream<Integer> sortedNums = numList.stream().sorted();
        sortedNums.forEach( num -> System.out.print( num + " , ") );
        System.out.println("\n-x-");

        System.out.println( "\nNumbers Squared = ");
        Stream<Integer> numStream2 = numList.stream();
        // .sorted to create a new stream to use
        Stream<Double> squares = numStream2.map( num -> Math.pow(num,2) ).sorted();
        squares.forEach( num -> System.out.print( num + " , ") );

        // Above Code in one line
        System.out.println( "\n Builder Design Pattern:");
        numList
                .stream()
                .map( num -> Math.pow(num,2) )
                .sorted()
                .forEach( num -> System.out.print( num + " , ") );

        // Let's Do Square if Number is Odd or Cube if Number is Even
        System.out.println( "\n Square if Number is Odd");
        numList
                .stream()
                .filter( num -> num%2 != 0 )
                .map( num -> Math.pow(num,2) )
                .sorted()
                .forEach( num -> System.out.print( num + " , ") );

        System.out.println( "\n Cube if Number is Even");
        numList
                .stream()
                .filter( num -> num%2 == 0 )
                .map( num -> Math.pow(num,3) )
                .sorted()
                .forEach( num -> System.out.print( num + " , ") );

        // .filter() - Filter Out Values from the Stream
        // .map() - Perform Operations on Values from the Stream
        // .sorted() - Sort Values from the Stream & return a New Stream
        // .forEach() - Iterate through Each Value one by one;

    }
}
