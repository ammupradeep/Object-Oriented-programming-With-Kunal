package com.OOProgramming.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal(); // can be override as well

        Daughter daughter = new Daughter(20);
        daughter.career();

        // We couldn't create an object of an abstract class
//        Parent mom = new Parent();

        Parent.hey();
    }
}
