package in.easysystems.collectionsframework.queue;

import java.util.ArrayDeque;

public class ArrayDequeueEg {
    public static void main(String[] args) {
        // Dequeue is a Doubly Ended Queue so we can add or remove elements both from front and back
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // offerLast() similar to offer() where it appends to the Queue
        arrayDeque.offerLast( 99 );
        arrayDeque.offer( 12 );
        arrayDeque.offerLast( 23 );

        System.out.println("1 = " + arrayDeque );

        // Add at the Start (Head) of the Queue
        arrayDeque.offerFirst( 33 );

        System.out.println("2 = " + arrayDeque );

        // .peek() to checkout the Element
        // Similar to peek
        System.out.println( "Show Element at the Start = " + arrayDeque.peekFirst() );
        System.out.println( "Show Element at the End = " + arrayDeque.peekLast() );

        // .poll() to remove the Element
        System.out.println("Remove Element at Last  = " + arrayDeque.pollLast() );
        System.out.println("3 = " + arrayDeque );
        // pollFirst() is similar to poll()
        System.out.println("Remove Element at Head  = " + arrayDeque.pollFirst() );
        System.out.println("4 = " + arrayDeque );
    }
}
