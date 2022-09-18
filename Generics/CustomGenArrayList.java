package com.OOProgramming.Generics;

import java.util.Arrays;

public class CustomGenArrayList<T>{

    private Object[] data ;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if(this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        //copy the value from data to temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        // Actually not removing but decreasing the size by one and if another data is inserted
        // this removed value is overridden
        T removed = (T)(data[--size]); // COZ t IS OF RESTRICTED WHERE DATA[SIZE ] IS AN OBJECT
        return removed;
    }

    public  T get(int index) {
        return (T)data[index];
    }
    public int size() {
        return size;
    }

    public void set (int index, T value){
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
//        CustomGenArrayList list = new CustomGenArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(234);

//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }
//
//        System.out.println(list); // override toString() for the correct output

        CustomGenArrayList<String> list3 = new CustomGenArrayList();

        for (int i = 0; i < 14; i++) {
            list3.add("5" + i );
        }

        System.out.println(list3);

//
//        CustomGenArrayList<String> list4 = new CustomGenArrayList<>();
//
//        for (int i = 0; i < 14; i++) {
//            list4.add(" a " + i);
//        }
//
//        System.out.println(list4);
    }

}
