package com.OOProgramming.Properties.This;

public class ReturnObject {
    int a, b;

    public ReturnObject() {
        a = 10;
        b = 30;
    }

    ReturnObject get() {
        // As return type
        return this;
    }
    void display() {
        System.out.println("a = "+ a + " b = " + b);
    }

    public static void main(String[] args) {
        ReturnObject obj = new ReturnObject();
        obj.get().display();
    }

}
