package com.OOProgramming.Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain {
    public static void main(String[] args) {
        Student kunal = new Student(23,99.8f);
        Student rahul = new Student(5,45.8f);
        Student ammu = new Student(8,90.8f);
        Student anu = new Student(13,75.8f);
        Student durga = new Student(43,91.8f);
        Student ranu = new Student(55,55.8f);

        Student[] list = {kunal, rahul, ammu, anu, durga, ranu};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list);

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return (int) (o1.marks - o2.marks); // ascending
//                return -(int) (o1.marks - o2.marks); // descending
//            }
//        });

        //using lambda expressions
        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));
    }
}
