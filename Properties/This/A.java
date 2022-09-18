package com.OOProgramming.Properties.This;

public class A {
    B obj;

    public A(B obj) {
        this.obj = obj;
        System.out.println("Inside A constructor");
        obj.display();
    }
}

class B {
    int x = 5;

    public B() {
        //6. As argument in constructor call
        A obj = new A(this);
        System.out.println("Inside B constructor");
    }

    void display() {
        System.out.println("Value of X in class B : " + x);
    }

    public static void main(String[] args) {
        B obj = new B();
        System.out.println("Inside Main");
    }
}
