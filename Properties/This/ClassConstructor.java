package com.OOProgramming.Properties.This;

public class ClassConstructor {
    int a,b;
    public ClassConstructor() {
        //2. Act as class constructor invoker
        this(20,40);
        System.out.println("Default constructor");
        System.out.println("a = "+ a + " b = " + b);
    }


    public ClassConstructor(int a, int b) {
        //1. As class variables
        this.a = a;
        this.b = b;
    }

    ClassConstructor get1() {
        //3. As return type
        return this;
    }

    void display(ClassConstructor obj) {
        System.out.println("a = "+ a + " b = " + b);
    }
    void get2(){
        //4. As method Parameter
        display(this);
    }

    public static void main(String[] args) {
        ClassConstructor obj = new ClassConstructor();
    }
}
