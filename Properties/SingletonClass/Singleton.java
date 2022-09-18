package com.OOProgramming.Properties.SingletonClass;

public class Singleton {
    //Class which we can only create one object
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        //check whether one object is created or not
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
