package com.OOProgramming.Properties.This;

public class ClassVariable {
    int a ;
    int b;

    public ClassVariable(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void display() {
        System.out.println("a = "+ a + " b = " + b);
    }

    public static void main(String[] args) {
        ClassVariable obj = new ClassVariable(12,56);
        obj.display();
    }
}
