package com.OOProgramming.Properties.Access;

public class Subclass extends A{
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(34,"Anu");
        int a = obj.num; // yes

//        System.out.println(obj instanceof A);
//        System.out.println(obj instanceof Subclass);
        System.out.println(obj instanceof Object);
    }
}
