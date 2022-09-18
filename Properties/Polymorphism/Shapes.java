package com.OOProgramming.Properties.Polymorphism;
// example for hierarchical also
public class Shapes {
    // Late binding - resolved at run time - overriding
    void area () {
        System.out.println("I am inside Shapes");
    }

    // if a method is final it cannot be overridden
    // Early binding - resolved at compile time

//    final void area () {
//        System.out.println("I am inside Shapes");
//    }

    static void greeting() {
        System.out.println("Shapes class greeting");
    }

}
