package com.OOProgramming.Properties.StaticExample.StaticDemo2;

public class Student {
    String studentName;
    int rollNo;

    // common for all
    static String clgName;
    // for number of students to set roll number common for all
    static int counter = 0;

    // constructor
    public Student(String studentName) {
        this.studentName = studentName;
        this.rollNo = setRollNumber();
    }

    static int setRollNumber() {
        counter++;
        return counter;
    }

    // set the name of college
    static void setClgName(String name) {
        clgName = name;
    }

    //Instance method
    void getStudentInfo() {
        System.out.println("name : "+ this.studentName);
        System.out.println("roll number : " + this.rollNo);

        System.out.println("college name : " + clgName);
    }

}
