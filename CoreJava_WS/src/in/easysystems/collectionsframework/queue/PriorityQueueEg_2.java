package in.easysystems.collectionsframework.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEg_2 {
    public static void main(String[] args) {
        // Queue is a First-In and First-Out (FIFO) DataStructure
        Queue<Integer> priQ_1 = new PriorityQueue<>( Comparator.reverseOrder() );

        // Min-Heap and Max-Heap implemented using PriorityQueue
        // Comparator.reverseOrder() means now Max Element will be sorted first - Descending Order
        // Comparator.naturalOrder() means Mix Element will be sorted first - Ascending Order
        // We use PriorityQueue to ensure we add a priority to our elements
        // Add an Element = Offer and Remove an Element = Poll

        // add() method instead of offer can be used
        priQ_1.offer( 45 );
        priQ_1.offer( 17 );
        priQ_1.offer( 33 );
        priQ_1.offer( 21 );
        priQ_1.offer( 99 );

        System.out.println("priQ 1 = " + priQ_1);

        // remove() instead of pool can be used
        System.out.println("priQ.poll()  = " + priQ_1.poll() );

        System.out.println("priQ 2 = " + priQ_1);

        // element() instead of peek can be used
        System.out.println("Check out the element to be removed next = " + priQ_1.peek() );

        // add(), element() or remove() will throw an exception if the Queue is empty so we don't use them

        /*
           99
         /    \
       45      33
      /  \
    17   21

         */
        Queue<String> priQ_2 = new PriorityQueue<>( Comparator.reverseOrder() );

        priQ_2.offer( "John" );
        priQ_2.offer( "Jane" );
        priQ_2.offer( "Mark" );
        priQ_2.offer( "Robert" );
        priQ_2.offer( "Barbara" );
        priQ_2.offer( "Lori" );
        priQ_2.offer( "Kevin" );
        priQ_2.offer( "Daymond" );

        System.out.println("priQ 3 = " + priQ_2);

        // remove() instead of pool can be used
        System.out.println("priQ.poll()  2 = " + priQ_2.poll() );

        System.out.println("priQ 4 = " + priQ_2);

        // element() instead of peek can be used
        System.out.println("Check out the element to be removed next = " + priQ_2.peek() );


        /*
            So what you saw printed ([Barbara, Daymond, Kevin, Jane, John, Mark, Lori, Robert])
            is the heap array, not a sorted list — every parent is smaller than its children,
            which is exactly what the heap property guarantees.

            Internal Heap Structure
                Robert
            /            \
        John              Mark
       /    \            /    \
    Daymond  Jane     Lori   Kevin
   /
Barbara
         */

        // To Print in sorted Order we use poll with a for loop
        System.out.println( "Printing INT Priority Queue Step by Step" );
        for (int i = 0; i <= priQ_1.size()+1; i++)
            System.out.println( i + " : " + priQ_1.poll() );

        System.out.println( "Printing String Priority Queue Step by Step" );
        for (int i = 0; i <= priQ_2.size()+1; i++)
            System.out.println( i + " : " + priQ_2.poll() );

        // poll for Sorting works perfectly cause everytime it will ensure the lowest value is at the top

    }
}
