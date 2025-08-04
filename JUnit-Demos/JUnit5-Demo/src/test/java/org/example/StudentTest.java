package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {
    Student student1 = new Student( "Jane", 25, 80 );
    Student student2 = new Student( "Jill", 35, 70 );
    Student student3 = new Student( "Dane", 20, 30 );

    void getStudentDetails(){
        System.out.println( "S1 = " + student1.toString() );
        System.out.println( "S2 = " + student2.toString() );
        System.out.println( "S3 = " + student3.toString() );
    }
    @Test
    void checkIfPassed(){
        getStudentDetails();

        Assertions.assertTrue( student1.getGrade() != 'F' );
        Assertions.assertTrue( student2.getGrade() != 'F' );
        Assertions.assertTrue( student3.getGrade() == 'F' );
    }
}