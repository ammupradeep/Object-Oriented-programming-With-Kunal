package com.OOProgramming.Generics.Comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollno + " " + marks;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("In compared to method");
        int diff = (int) (this.marks - o.marks);

        // if diff = 0 : both are equal
        // if diff < 1 : o is bigger
        // if diff > 1 : this is bigger

        return diff;
    }
}
