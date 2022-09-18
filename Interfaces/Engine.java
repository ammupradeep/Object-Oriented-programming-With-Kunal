package com.OOProgramming.Interfaces;

public interface Engine {
    //By default all variables in interfaces are static and final
    static final int  PRICE = 75000;

    void start();
    void stop();
    void acc();
}
