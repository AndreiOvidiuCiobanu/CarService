package com.fmi.project.car;

import com.fmi.project.fuel.Fuel;

public class Cabrio extends Car {

    private int timeOfScalping;

    public Cabrio(String brand, String model, int euro, String color, int horsePower,
                  int cilindricalCapacity, long numberOfKilometres, double consumption,
                  int priceToFull, Fuel fuel, int timeOfScalping) {

        super(brand, model, euro, color, horsePower, cilindricalCapacity,
                numberOfKilometres, consumption, priceToFull, fuel);

        this.timeOfScalping = timeOfScalping;
    }

    public Cabrio(int timeOfScalping) {
        this.timeOfScalping = timeOfScalping;
    }

    public Cabrio() {
    }

    public int getTimeOfScalping() {
        return timeOfScalping;
    }

    public void setTimeOfScalping(int timeOfScalping) {
        this.timeOfScalping = timeOfScalping;
    }
}
