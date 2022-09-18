package com.OOProgramming.Properties.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    //data common to all humans
    static long population;

    static void message() {
        System.out.println("Hello World");

        System.out.println();
        // we cannot access any object inside static method coz it does not depend on any objects
        // System.out.println(this.age); // we cant use this
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
//        Human.message();
    }
}
