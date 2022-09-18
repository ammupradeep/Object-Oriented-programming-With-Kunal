package com.OOProgramming.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();

        //parent obj = new child();
        Shapes square = new Square();
//        Square square = new Square();


        //the reference type Shapes should have the function (rhs)
        //if no area() found in square it will go to shapes
//        square.area();

        Shapes triangle = new Triangle();

        // if both Parent and child functions are static variable types decides
        // what to work not the assigned object type.
        triangle.greeting();
    }
}
