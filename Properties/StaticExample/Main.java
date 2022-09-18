package com.OOProgramming.Properties.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human ammu = new Human(22,"Ammukutty Pradeep",10000,false);
        Human anu = new Human(23,"Anu",10000,true);

//        System.out.println(Human.population);
//        System.out.println(Human.population);

        // Static variable is not depend on objects
        // it can access without creating an object

        Main funn = new Main();
        funn.fun2();




    }

       //not depend on objects
       // but the functions you are inside is not using any instances

        // you cannot access not static stuff without referencing their instances in a static context
        static void fun() {
//        greeting(); // you cant use this because this requires an instance


            // hence I am referencing it
        //to work we have to assign the function to an object
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        fun();
        greeting();
    }

    //  something that is not static is belongs to an objects
    void greeting() {
        System.out.println("Hello world");
        fun(); //can work
    }
}
