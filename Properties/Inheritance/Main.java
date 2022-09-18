package com.OOProgramming.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4.2, 6.5, 9.6);
//        Box box2 = new Box(box1);
//
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//        System.out.println(box3.l + " " + box3.h + " " + box3.weight);

//        Box box5 = new BoxWeight(2,4,5,8); //reference variable is important
        // System.out.println(box5.weight); // could not work bcoz a parent can't access its child's variable


        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type ie. BoxWeight
        // hence, you should have access to weight variable
        // BoxWeight box6;
        // this also means , that the ones you are trying to access should be initialized
        // but here , when the obj itself is of type parent class  , how will you call the constructor new Box(); ??
        // this is why error

//        BoxWeight box6 = new Box();
//        System.out.println(box6);

//        BoxPrice box = new BoxPrice(2,3,4);
//        System.out.println(box.cost);

        Box.greeting();
        Box obj = new BoxWeight();
        BoxWeight.greeting();

//        BoxWeight box = new BoxWeight();
//        box.greeting(); // will execute BoxWeight static

    }
}
