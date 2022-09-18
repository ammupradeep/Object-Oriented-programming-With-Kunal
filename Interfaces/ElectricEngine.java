package com.OOProgramming.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("ElectricEngine starts");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stop");
    }

    @Override
    public void acc() {
        System.out.println("ElectricEngine accelerate");
    }
}
