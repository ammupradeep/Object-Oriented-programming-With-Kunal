package com.OOProgramming.Brototype.Thread;

public class SampleThread2 implements Runnable{
    int a;

    public SampleThread2(int a) {
        this.a = a;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + a + " count " + i);
            // Interrupted Exception may happen
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
