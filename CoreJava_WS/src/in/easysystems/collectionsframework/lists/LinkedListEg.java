package in.easysystems.collectionsframework.lists;

import java.util.*;

/*  Instead of new ArrayList<>() we can use new LinkedList<>() and all the same functions will work
    Use ArrayList when you need fast access to elements by index.
    Use LinkedList when you need frequent insertions or deletions in the middle of the list.

    In Java, an ArrayList uses a dynamic array, offering fast random access but slow insertions
    and deletions since elements must shift. A LinkedList, built as a doubly linked list,
    provides fast insertions and deletions but slow access because it must traverse nodes
    sequentially. ArrayList is more memory-efficient, while LinkedList uses more memory
    due to node pointers.
    In short, use ArrayList for quick access and LinkedList for frequent modifications.
 */

public class LinkedListEg {
    public static void main(String[] args) {

        // Arrays are not Dynamically Sized but ArrayList can expand or contract based on it's Elements
        String[] namesArr = { "John Doe", "Jane Doe", "Chandler Bing", "Joey Tribbiani" };
        System.out.println("names = " + Arrays.toString( namesArr ) + "\t Size : " + namesArr.length );

        // Not Allowed
        // namesArr[3] = "Ms. Chanandler Bong";

        List<String> namesList = new LinkedList<>();


        namesList.add( "John Doe" );
        namesList.add( "Jane Doe" );
        namesList.add( "Chandler Bing" );
        namesList.add( "Joey Tribbiani" );
        System.out.println("1 = " + namesList + "\t Size 1 : " + namesList.size() );

        // append at the end of the list by default
        namesList.add( "Chanandler Bong" );
        namesList.add( "Ken Addams" );
        System.out.println("2 = " + namesList + "\t Size 2 : " + namesList.size() );

        // Internally creates an Array of Size 10  and then incrementally increases the size
        // ArrayList Size Increase: If ArrayList Size = n then Size Increase = (n + n/2 + 1)

        // add at index 0 based and element to Add
        namesList.add( 4, "Monica Geller" );
        System.out.println("3 = " + namesList + "\t Size 3 : " + namesList.size() );

        List<String> names = new LinkedList<>();
        names.add( "Rachel Greene" );
        names.add( "Phoebe Buffay" );
        names.add( "Ross Geller" );

        // Add entire List
        namesList.addAll( 5, names );
        namesList.add( "Regina Philange" );
        System.out.println("4 = " + namesList + "\t Size 4 : " + namesList.size() );

        // Get a particular Element
        System.out.println( "1st = " + namesList.getFirst() + "\t Last : " + names.getLast() );
        System.out.println("Item at Position 8-1 = " + namesList.get(8) );

        // Update a Particular Value
        // Set Item Time Complexity = 0(1) because we are setting directly at the location
        namesList.set( 8, "Ms. Chanandler Bong" );
        System.out.println("Item at Position 8-2 = " + namesList.get(8) );

        // Remove a particular Element
        namesList.remove( 8 ); // position
        namesList.remove( 1 ); // position
        namesList.remove( "Ken Addams" ); // Remove by value
        namesList.removeFirst(); // Remove first element
        namesList.removeLast(); // Remove last element

        System.out.println("5 = " + namesList + "\t Size 5 : " + namesList.size() );

        // Check if Item Present in List - Time complexity = 0(n) because it has to traverse the entire list
        System.out.println("Joey Exists = " + namesList.contains( "Joey Tribbiani" ) );
        System.out.println("Gunther Exists = " + namesList.contains( "Gunther Central Perk" ) );

        // Traverse each Element for Printing
        System.out.println( "For Loop print" );
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println( "\t" + i + " : " + namesList.get(i).toLowerCase() );
        }

        System.out.println( "ForEach Loop" );
        for (String name : namesList)
            System.out.println("\t name  = " + name.toUpperCase() );

        System.out.println( "Iterator Print" );
        Iterator<String> itr = namesList.listIterator();

        while( itr.hasNext() )
            System.out.println("\t name  = " + itr.next() );

        // Remove Entire list
        namesList.clear();
        System.out.println("6 = " + namesList + "\t Size 6 : " + namesList.size() );

        // Any insertion or deletion of elements creates internal shifting so Time Complexity = 0(n)

        // Create Multiple Copies of Same Element with nCopies()
        List<String> languagesKnown = new LinkedList<>();

        languagesKnown.addAll(Collections.nCopies(3, "C"));
        languagesKnown.addAll(Collections.nCopies(5, "Java"));
        languagesKnown.addAll(Collections.nCopies(4, "SQL"));
        languagesKnown.addAll(Collections.nCopies(2, "Python"));

        System.out.println("languagesKnown = " + languagesKnown);

        List<List<String>> languagesKnown2 = new LinkedList<>();

        languagesKnown2.add(new ArrayList<>(Collections.nCopies(1, "C")));
        languagesKnown2.add(new ArrayList<>(Collections.nCopies(5, "Java")));
        languagesKnown2.add(new ArrayList<>(Collections.nCopies(4, "SQL")));
        languagesKnown2.add(new ArrayList<>(Collections.nCopies(2, "Python")));

        System.out.println("languagesKnown2 = " + languagesKnown2);

    }
}
