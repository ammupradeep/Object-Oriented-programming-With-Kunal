package com.OOProgramming.Properties.SingletonClass;

import com.OOProgramming.Properties.Access.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(34,"Anu");
        int a = obj.num; // yes
    }
}
