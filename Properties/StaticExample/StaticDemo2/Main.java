package com.OOProgramming.Properties.StaticExample.StaticDemo2;

public class Main {
    public static void main(String[] args) {
        Student.setClgName("XYZ");

        Student s1 = new Student("ammu");
        Student s2 = new Student("ram");

        s1.getStudentInfo();
        System.out.println(" ");
        s2.getStudentInfo();
    }
}
