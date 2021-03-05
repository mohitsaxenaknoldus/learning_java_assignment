package com.knoldus.learning.solid;

interface EngineVehicle {
    void startEngine() throws Exception;
}

interface NonEngineVehicle {
    void startEngine() throws Exception;
}

class Car extends Vehicle implements EngineVehicle{
    @Override
    public void startEngine() throws Exception {
        throw new Exception("Start Engine supported");
    }
}

class BiCycle extends Vehicle implements NonEngineVehicle{
    @Override
    public void startEngine() throws Exception {
        throw new Exception("Start Engine not supported");
    }
}

public class Vehicle {
    public void startEngine() throws Exception {
    }

    public static void main(String [] a) throws Exception {
        Vehicle v = new Car();
        v.startEngine();
        Vehicle b = new BiCycle();
        b.startEngine();
    }
}
