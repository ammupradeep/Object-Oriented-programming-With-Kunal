package com.OOProgramming.Properties.StaticExample;
//Outer clases never be static
//But nested class can be static
public class Innerclass {
//    class Test{
//        String name;
//
//        public Test(String name) {
//            this.name = name;
//        }
//    }

    static class Test2{
        //static String name;
        //this can't be static coz the whole class is static ;)
        static String name;

        public Test2(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // we cannot use Test class inside this
        // because the Test class itself is inside another class which means it is dependent on an object.
//        Test a = new Test("Ammu");

        // But Test2 is all fine after using static in it
        Test2 a = new Test2("Ammu");
        Test2 b = new Test2("Anu");

        System.out.println(a.name);
        System.out.println(b.name);

//        System.out.println(Test2.name);
    }
}

//Static stuff resolved over compile time
