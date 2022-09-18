package com.OOProgramming.Interfaces;

public class NiceCar {
    //engine from interface
    private Engine engine;

    private Media player = new CDPlayer();

    // new power engine
    public NiceCar() {
        engine = new PowerEngine();
    }

    // engine of your own
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }
    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }


}
