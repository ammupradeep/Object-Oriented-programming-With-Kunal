package com.OOProgramming.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr ;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr  = new int[]{1,24,6,9,2};
    }

    // no need this one
//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

//    @Override // inside The Object
//    public Object clone() throws CloneNotSupportedException{
//        // Shallow copy
//        return super.clone();
//    }

    @Override // inside The Object
    public Object clone() throws CloneNotSupportedException{
        // Deep copy
        Human twin = (Human)super.clone(); // actually shallow copy


        // make it as a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
