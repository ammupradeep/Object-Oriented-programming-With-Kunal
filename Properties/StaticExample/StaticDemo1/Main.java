package com.OOProgramming.Properties.StaticExample.StaticDemo1;

public class Main {
    static int a = fun();

    static {
        System.out.println("Inside Static block");
    }


    static int fun () {
        System.out.println("Inside Demo and fun");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("Value of a is " + a);
        System.out.println("From main");
    }
}
