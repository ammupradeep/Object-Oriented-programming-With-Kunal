package com.OOProgramming.AbstractDemo;

public class Son extends Parent{
    // works without parent constructor
//    public Daughter(int age) {
//        this.age = age;
//    }

    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Wanda Women");
    }
}
