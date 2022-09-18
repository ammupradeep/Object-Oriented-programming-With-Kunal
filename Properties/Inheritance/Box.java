package com.OOProgramming.Properties.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    static void greeting () {
        System.out.println("Hey I am in Box class");
    }

    Box() {
//         super(); //calling Object class

        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
