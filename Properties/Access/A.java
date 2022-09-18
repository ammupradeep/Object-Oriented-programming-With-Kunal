package com.OOProgramming.Properties.Access;

public class A {
    protected int num;
    String name;
    int[] arr;

    // setter sets the value
    public void setNum(int num) {
        this.num = num;
    }

    // getter gets the value
    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
