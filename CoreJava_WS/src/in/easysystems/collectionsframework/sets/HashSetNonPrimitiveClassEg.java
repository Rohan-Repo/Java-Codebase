package in.easysystems.collectionsframework.sets;

import in.easysystems.pojos.Student1;
import in.easysystems.pojos.Student2;

import java.util.HashSet;

public class HashSetNonPrimitiveClassEg {
    public static void main(String[] args) {
        HashSet<Student1> student1HashSet = new HashSet<>();

        // Create Similar Objects it won't understand and since its a new Student1 it assumes it's unique
        // As it compares based on the equals() and hashCode() methods internally
        student1HashSet.add( new Student1(1, "John Doe", "MS") );
        student1HashSet.add( new Student1(1, "John Doe", "MS") );
        student1HashSet.add( new Student1(2, "Jane Doe", "MBA") );
        student1HashSet.add( new Student1(2, "Jane Doe", "MBA") );

        System.out.println("student1HashSet = " + student1HashSet);
        System.out.println("Total Size = " + student1HashSet.size() );

        // Let's overwrite equals() and hashCode() methods to ensure only unique values are saved
        // We do that based on the Student's Registration Number
        HashSet<Student2> student2HashSet = new HashSet<>();

        // Create Similar Objects it won't understand and since it's a new Student2 it assumes it's unique
        // As it compares based on the equals() and hashCode() methods internally
        // As we have overidden equals() and hashCode() methods now it stores only Unique Values
        student2HashSet .add( new Student2(1, "John Doe", "MS") );
        student2HashSet .add( new Student2(1, "John Doe", "MS") );
        student2HashSet.add( new Student2(2, "Jane Doe", "MBA") );
        student2HashSet.add( new Student2(2, "Jane Doe", "MBA") );
        System.out.println("\n student2HashSet = " + student2HashSet );
        System.out.println("Total Size = " + student2HashSet.size() );

        student2HashSet.add( new Student2(3, "Jane Doe", "MS") );
        student2HashSet .add( new Student2(4, "John Doe", "MBA") );

        // It will allow this because we have added HashCode on studRegNum,
        // Also we can have folks with same name in different Degrees
        System.out.println("\n student2HashSet = " + student2HashSet );
        System.out.println("Total Size = " + student2HashSet.size() );

    }
}
