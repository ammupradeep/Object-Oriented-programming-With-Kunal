package com.OOProgramming.AbstractDemo;

import javax.lang.model.element.PackageElement;
// Abstract classes never be final coz final prevents inheritance
public abstract class Parent {
//    static int age;
    int age;
    final int value;

    public Parent(int age) {
        this.age = age;
        this.value = 3442;
    }

    // Couldn't create abstract constructor
//    abstract Parent() { }
    //Couldn't create abstract static methods'

    //Can have static methods and normal methods
    static void hey () {
        System.out.println("HELLO");
    }

    void normal () {
        System.out.println("Hey I'm normal method");
    }

    abstract void career();
    abstract void partner();
}
