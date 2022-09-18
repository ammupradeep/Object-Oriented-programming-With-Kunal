package com.OOProgramming.Properties.This;

public class ClassInvoker {
    void display() {
        //5. As class method invoker
        this.show();
        System.out.println("Inside display");
    }

    void show() {
        System.out.println("Inside show");
    }

    public static void main(String[] args) {
        ClassInvoker obj = new ClassInvoker();
        obj.display();
    }
}
