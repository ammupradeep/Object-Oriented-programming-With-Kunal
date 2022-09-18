package com.OOProgramming.Generics;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data ;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if(this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        //copy the value from data to temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        // Actually not removing but decreasing the size by one and if another data is inserted
        // this removed value is overridden
        int removed = data[--size];
        return removed;
    }

    public  int get(int index) {
        return data[index];
    }
    public int size() {
        return size;
    }

    public void set (int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list =  new ArrayList();
//        list.add(12);
//        list.remove(2);
//        list.set(2,45645);
//        list.isEmpty();

        // we are going to create our own arraylist
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(234);

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }

        System.out.println(list); // override toString() for the correct output
    }
}
