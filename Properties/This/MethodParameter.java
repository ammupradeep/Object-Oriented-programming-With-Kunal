package com.OOProgramming.Properties.This;

public class MethodParameter {
    int a, b;

    public MethodParameter() {
        a = 20;
        b = 70;
    }

    void display(MethodParameter obj) {
        System.out.println("a = "+ a + " b = " + b);
    }

    void get(){
        // As method Parameter
        display(this);
    }

    public static void main(String[] args) {
        MethodParameter obj = new MethodParameter();
        obj.get();
    }
}
