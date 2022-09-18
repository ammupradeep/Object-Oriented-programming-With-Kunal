package com.OOProgramming.Generics;

import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends Number>{

    private Object[] data ;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if(this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    // Wildcard
    public void getList(List<Number> list) {
        // here it will only pass number type
    }
    public void getsList(List<? extends Number> list) {
        // here any number types like int, float, double are possible
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

//        WildCardExample<String> list3 = new WildCardExample(); // Error coz its extending Number class
        WildCardExample<Float> list3 = new WildCardExample();

        for (int i = 0; i < 14; i++) {
            list3.add(5.6f * i );
        }

        System.out.println(list3);

    }

}
