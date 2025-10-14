package in.easysystems.collectionsframework.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorsEg {
    public static void main(String[] args) throws InterruptedException {
        // Vectors were introduced before ArrayList & it is under the List Interface so has quite a few similar methods
        int size = 1000000;

        List<Integer> arrList = new ArrayList<>();
        List<Integer> intVector = new Vector<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++)
            arrList.add( i );

        long endTime = System.currentTimeMillis();

        System.out.println("ArrayList - Total Time to add a Million Elements = " + (endTime - startTime) + "ms" );

        startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++)
            intVector.add( i );

        endTime = System.currentTimeMillis();

        System.out.println("Vector - Total Time to add a Million Elements = " + (endTime - startTime) + "ms" );

        List<Integer> multiThreadedList = new ArrayList<>();

        startTime = System.currentTimeMillis();

        Thread t1 = new Thread( () -> {
            for (int i = 0; i < size; i++)
                multiThreadedList.add( i );
        });

        Thread t2 = new Thread( () -> {
            for (int i = 0; i < size; i++)
                multiThreadedList.add( i );
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        endTime = System.currentTimeMillis();

        System.out.println("MultiThreaded ArrayList - Total Time to add a Million Elements = " + (endTime - startTime) + "ms" );
        System.out.println("MultiThreaded ArrayList - Total Number of Elements = " + multiThreadedList.size() );

        List<Integer> multiThreadedVector = new Vector<>();

        startTime = System.currentTimeMillis();

        Thread t3 = new Thread( () -> {
            for (int i = 0; i < size; i++)
                multiThreadedVector.add( i );
        });

        Thread t4 = new Thread( () -> {
            for (int i = 0; i < size; i++)
                multiThreadedVector.add( i );
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        endTime = System.currentTimeMillis();

        System.out.println("MultiThreaded Vector - Total Time to add a Million Elements = " + (endTime - startTime) + "ms" );
        System.out.println("MultiThreaded Vector - Total Number of Elements = " + multiThreadedVector.size() );

        // Thus in a multithreaded environment Vector takes time but always have 2 Million records whereas ArrayList data size differs with each run
        // Because the operations on an ArrayList are not synchronized i.e. they are not Thread-Safe and sometimes raises exceptions

        // But to overcome we can use the Collections.synchronizedList() to ensure synchronization and thread safety
        List<Integer> synchronizedMultiThreadedList = Collections.synchronizedList( new ArrayList<>() );

        startTime = System.currentTimeMillis();

        Thread t5 = new Thread( () -> {
            for (int i = 0; i < size; i++)
                synchronizedMultiThreadedList.add( i );
        });

        Thread t6 = new Thread( () -> {
            for (int i = 0; i < size; i++)
                synchronizedMultiThreadedList.add( i );
        });

        t5.start();
        t6.start();
        t5.join();
        t6.join();

        endTime = System.currentTimeMillis();

        System.out.println("Synchronized MultiThreaded ArrayList - Total Time to add a Million Elements = " + (endTime - startTime) + "ms" );
        System.out.println("Synchronized MultiThreaded ArrayList - Total Number of Elements = " + synchronizedMultiThreadedList.size() );

        // Collections.synchronizedList() takes longer but ensures Data Integrity;
        // Generally better to Use ArrayList over Vectors in the majority of the use-cases
    }
}
