package com.OOProgramming.Brototype.Thread;

public class SampleThread extends Thread{
    int a;

    public SampleThread(int a) {
        this.a = a;
    }
    @Override
    public void run(){
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + a + " count " + i);
            // Interrupted Exception may happen
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
