package in.easysystems.collectionsframework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueEg {
    public static void main(String[] args) {
        // Queue is a First-In and First-Out (FIFO) DataStructure
        Queue<String> queueLL = new LinkedList<>();

        // Add an Element = Offer and Remove an Element = Poll

        // add() method instead of offer can be used
        queueLL.offer( "Let us C" );
        queueLL.offer( "Thinking in Java" );
        queueLL.offer( "Linux for Beginners" );

        System.out.println("queueLL 1 = " + queueLL);

        // remove() instead of pool can be used
        System.out.println("queueLL.poll()  = " + queueLL.poll() );

        System.out.println("queueLL 2 = " + queueLL);

        // element() instead of peek can be used
        System.out.println("Check out the element to be removed next = " + queueLL.peek() );

        // add(), element() or remove() will throw an exception if the Queue is empty so we don't use them
    }

}
