package org.example;

import java.util.StringJoiner;

public class Student {
    private String name;
    private int age;
    private int marks;

    private char grade;

    public Student() {
    }

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;

        setGrade( this.marks );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
        setGrade( this.marks );
    }

    public void setGrade(int marks) {
        if( marks < 50 )
            grade = 'F';
        else if ( marks >=50 && marks <60 )
            grade = 'D';
        else if ( marks >=60 && marks <70 )
            grade = 'C';
        else if ( marks >=70 && marks <80 )
            grade = 'B';
        else if ( marks >=80 && marks <90 )
            grade = 'A';
        else
            grade = 'O';
    }

    public char getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("marks=" + marks)
                .add("grade=" + getGrade() )
                .toString();
    }
}