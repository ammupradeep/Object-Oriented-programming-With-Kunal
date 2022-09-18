package com.OOProgramming.Properties.Inheritance;

public class BoxWeight extends Box{
    double weight;

//    @Override
//    static void greeting () {
//        System.out.println("Hey I am in BoxWeight class");
//    }

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (double side, double weight) {
        super(side);
        this.weight = weight;
    }


    public BoxWeight(BoxWeight other) {
        super(other);  // same as Box box = new BoxWeight();
        weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);  //call the parent class constructor
        // used to initialize the values present in parent class

        // can use also like this to access variables from the parent class
        System.out.println(super.w);

        this.weight = weight;
        // super(l, h, w); // not possible
    }
}

// super();

// All classes are inherited from the Object class
// If any class calls super() it calling the class just above it

// parent class should be initialized first which means super must be at the beginning
