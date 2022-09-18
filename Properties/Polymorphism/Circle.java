package com.OOProgramming.Properties.Polymorphism;

public class Circle extends Shapes{
    // This will run when obj of Circle is being created
    // Hence it is overriding the parent method
    @Override // this is the annotation to check
    void area () {
        System.out.println("Area is 3.14 * r * r");
    }
}
