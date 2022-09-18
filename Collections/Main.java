package com.OOProgramming.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        // No multi threading
        List<Integer> vector = new Vector<>();

        vector.add(75);
        vector.add(65);
        vector.add(55);
        vector.add(45);
        vector.add(35);

        System.out.println(vector);
    }
}
