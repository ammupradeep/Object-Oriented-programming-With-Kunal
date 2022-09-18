package com.OOProgramming.Properties.SingletonClass;

import com.OOProgramming.Properties.Access.A;

public class Main {
    public static void main(String[] args) {
        //Singleton obj = new Singleton();  private so could not create

        //Singleton obj = Singleton.getInstance(); Non static method cannot be referred in static context

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        //all 3 reference variables are pointing to just one object

        A obj =  new A(10,"Ammu");
//        obj.getNum(); // when private

//        int a = obj.num; // when no one is given don't work outside the package and also for protected
    }
}
