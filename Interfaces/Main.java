package com.OOProgramming.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        //Engine car = new Car();
        // car.n;    we couldn't access this one coz
        // lhs define where to access n is inside car not inside Engine
        // rhs will decide which version should access so the override happens

//        car.acc();
//        car.start();
//        car.stop();
//        car.brake();

        // 1. problem occur will be Engine and Media both have start and stop if
        // media is stopped the engine get stopped like this:

//        Media mediaCar = new Car();
//        mediaCar.stop();

        // Engine stopped!!!!
        //Let's clear this by making separate classes in same interfaces


        NiceCar BMW = new NiceCar();

        BMW.start();
        BMW.startMusic();
        //Without changing the car of turning of the car or creating new car
        BMW.upgradeEngine();
        BMW.start();

    }
}
