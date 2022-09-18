package com.OOProgramming.AbstractDemo;

public class Daughter extends Parent{
    // works without parent constructor
//    public Daughter(int age) {
//        this.age = age;
//    }

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }
}
