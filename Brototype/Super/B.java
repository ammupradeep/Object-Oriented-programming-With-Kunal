package com.OOProgramming.Brototype.Super;

public class B extends A {
    int b;
    public B() {
        System.out.println("Hey I am B");
    }

    public B(int b) {
        super(b);
        System.out.println("Argument Constructor pf B");
    }

    void displayB() {
        super.display();
//        System.out.println("Welcome A");
    }
}
