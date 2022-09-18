package com.OOProgramming.Properties.Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Ammu");

        // Need to do few things
        // 1. Access data members
        // 2.Modify the data members etc

        // It is not conventionally good to have access to all the variables inside a Class
        // It will not have any security then.
        // Here comes the access modifiers to hide the data
        // But we  can do get the variables and set them.

//        ArrayList<Integer> obj1 = new ArrayList<>();

//        obj.num;

//        obj.getNum();
//        int a = obj.num; //  can access if nothing is given and also for protected

        ObjectDemo obj2 = new ObjectDemo(34, 67.8f);
        ObjectDemo obj3 = new ObjectDemo(34, 70.1f);
        // add some algorithm to a number to uniquely identify it
        // for same numbers they will give different value
//        System.out.println(obj2.hashCode());
//        System.out.println(obj3.hashCode());

//        if(obj2 < obj3) { // error java get confused
//            System.out.println("Obj2 is less than obj3");
//        }

        // checking references
        if(obj2 == obj3){
            System.out.println("Obj2 is equals obj3");
        }

        // Checking actual value
        if(obj2.equals(obj3)){
            System.out.println("Obj2 is equals obj3");
        }

        // why getClass() can't be overridden coz it is a final class
        System.out.println(obj2.getClass().getName());

    }


}
