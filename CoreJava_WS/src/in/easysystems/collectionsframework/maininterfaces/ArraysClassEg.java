package in.easysystems.collectionsframework.maininterfaces;

import java.util.Arrays;

public class ArraysClassEg {
    public static void main(String[] args) {
        String[] namesArr = { "John Doe", "Jane Doe", "Chandler Bing", "Joey Tribbiani" };
        System.out.println("names = " + Arrays.toString( namesArr ) + "\t Size : " + namesArr.length );

        int[] nums = { -12,1,99,123,45,-97,27,13,777 };
        System.out.println("1 = " + Arrays.toString( nums ) + "\t Size : " + nums.length );

        // Ready-made Binary Search
        int pos1 = Arrays.binarySearch( nums, 45 );
        int pos2 = Arrays.binarySearch( nums, 15 );

        System.out.println("45 Present at Index #" + pos1);
        System.out.println("15 Present at Index #" + pos2);

        Arrays.sort(nums);

        System.out.println("2 = " + Arrays.toString( nums ) + "\t Size : " + nums.length );

        // Fill Arrays with Default Values
        int[] baseNums = new int[10];
        Arrays.fill( baseNums, 777 );

        System.out.println("baseNums = " + Arrays.toString( baseNums ) );

        boolean[] baseBools = new boolean[5];
        Arrays.fill( baseBools, false );
        System.out.println("baseBools = " + Arrays.toString( baseBools ));

    }
}
