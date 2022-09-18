package com.OOProgramming.Properties.StaticExample;

//initialisation static variables
public class StaticBlock {
    static int a = 4;
    static int b ;

    // Will only run once when the first object is created ie, when thr class is loaded for the first time
    static {
        System.out.println("I am static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
