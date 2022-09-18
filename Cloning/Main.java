package com.OOProgramming.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ammu =new Human(23,"Ammu Pradeep");
//        Human anu = new Human(ammu); // take some more time

        // Here comes cloning
        Human twin = (Human)ammu.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[1] = 100;
        twin.name = "Anu";
        System.out.println(twin.name);
        System.out.println(ammu.name);
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(ammu.arr));
    }
}
