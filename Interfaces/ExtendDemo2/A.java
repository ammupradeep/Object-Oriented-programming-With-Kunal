package com.OOProgramming.Interfaces.ExtendDemo2;

public interface A {
    //static interface method should always have a body
//    static void greetings(); // not work
    static void greeting() {
        System.out.println("Hey Welcome I am in static");
    }

//    void fun();
    // jdk8 onwards a default is used

    default void fun() {
        System.out.println("Hy I am in A");
    }
}
