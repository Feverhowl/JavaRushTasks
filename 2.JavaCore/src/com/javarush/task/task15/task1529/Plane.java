package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    private int passengers;

    public int getPassengers() {
        return passengers;
    }

    Plane(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void fly() { }
}
