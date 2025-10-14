package in.easysystems.collectionsframework.maininterfaces;

import in.easysystems.pojos.Student3;

import java.util.*;

public class CollectionsClassEg {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add( -12 );
        nums.add( 1 );
        nums.add( 99 );
        nums.add( 777 );
        nums.add( 123 );
        nums.add( 45 );
        nums.add( 777 );
        nums.add( -97 );
        nums.add( 27 );
        nums.add( 13 );
        nums.add( 777 );

        System.out.println("nums = " + nums);

        System.out.println( "Minimum Value : " + Collections.min(nums) );
        System.out.println( "Max Value : " + Collections.max(nums) );
        System.out.println( "777 Frequency Count : " + Collections.frequency(nums, 777) );

        Collections.sort( nums );
        System.out.println("Ascending = " + nums);

        Collections.sort( nums, Comparator.reverseOrder() );
        System.out.println("Descending = " + nums);

        // For normal Values sort works
        // But if it's a List of UserDefined Objects then the Object has to implement Comparable interface
        List<Student3> studList = new ArrayList<>();

        studList.add( new Student3(3, "Harvey Specter", "LLB") );
        studList .add( new Student3(1, "Mike Ross", "MS") );
        studList .add( new Student3(4, "Louis Litt", "PHD") );
        studList.add( new Student3(2, "Jessica Pearson", "MBA") );

        System.out.println("\n Students Initially = " + studList);

        Collections.sort( studList );
        System.out.println("\n Students Sorted by RollNumber = " + studList);
        // Comparable Interface can compare based on only one type of Value
        // If we want more flexibility then implement Comparator

        // Sort Using Comparator
        Collections.sort(studList, new Comparator<Student3>() {
            @Override
            public int compare(Student3 stud1, Student3 stud2) {
                return stud1.getStudName().compareTo( stud2.getStudName() );
            }
        });

        System.out.println("\n Students Sorted by Name = " + studList);

        // Sort Using Lambda
        Collections.sort( studList,
                (stud1, stud2) -> stud1.getStudDegree().compareTo(stud2.getStudDegree()));

        System.out.println("\n Students Sorted by Degree = " + studList);
    }
}
