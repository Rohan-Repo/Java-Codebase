package in.easysystems.collectionsframework.lists;

import java.util.Stack;

public class StackEg {
    public static void main(String[] args) {
        // Stack is a Last-In and First-Out (LIFO) DataStructure
        // Add an Element = Push and Remove an Element = Pop

        Stack<String> bookList = new Stack<>();
        bookList.push( "Let us C" );
        bookList.push( "Thinking in Java" );
        bookList.push( "Linux for Beginners" );

        System.out.println("1 = " + bookList);

        System.out.println("Check out the element at Top = " + bookList.peek() );

        System.out.println("2 = " + bookList);

        System.out.println("Take Out the Top Element = " + bookList.pop() );

        System.out.println("3 = " + bookList);
    }
}
