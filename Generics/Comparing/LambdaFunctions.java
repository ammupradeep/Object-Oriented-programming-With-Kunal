package com.OOProgramming.Generics.Comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
        //consumer superInteger action
        // which item is the parameter and the instruction after arrow is the statement for each item
//        arr.forEach((item)-> System.out.println(item * 2));

        // another way
        Consumer<Integer> fun = (item)-> System.out.println(item * 2);
        arr.forEach(fun);

        // Lambda expressions
        // Assign things to variable that are of type interface


        // Consumer takes only one bt we created our own for 2
        // lambda fn to implement the interface
        Operation sum = (a,b) -> a + b;
        Operation prod = (a,b) -> a * b;
        Operation sub = (a,b) -> a - b;
        Operation div = (a,b) -> a / b;

        LambdaFunctions mycalculator = new LambdaFunctions();
        System.out.println(mycalculator.operate(3,4,sum));
        System.out.println(mycalculator.operate(3,4,prod));
        System.out.println(mycalculator.operate(3,4,sub));
        System.out.println(mycalculator.operate(3,4,div));

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a,b);
    }
}

interface Operation {
    int operation(int a, int b);
}

