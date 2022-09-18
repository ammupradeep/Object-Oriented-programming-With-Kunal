package com.OOProgramming.Brototype.Thread;

public class Main {
    public static void main(String[] args) {
//        SampleThread Thread1 = new SampleThread(1);
//        SampleThread Thread2 = new SampleThread(2);
//        SampleThread Thread3 = new SampleThread(3);
//
//        Thread1.start();
//        Thread2.start();
//        Thread3.start();

        SampleThread2 Thread1 = new SampleThread2(1);
        SampleThread2 Thread2 = new SampleThread2(2);
        SampleThread2 Thread3 = new SampleThread2(3);

        Thread1.run();
        Thread2.run();
        Thread3.run();
    }
}
