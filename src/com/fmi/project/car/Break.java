package com.fmi.project.car;

import com.fmi.project.fuel.Fuel;

public class Break extends Car {

    private int trunkCapacity;

    public Break(String brand, String model, int euro, String color, int horsePower,
                 int cilindricalCapacity, long numberOfKilometres, double consumption,
                 int priceToFull, Fuel fuel, int trunkCapacity) {

        super(brand, model, euro, color, horsePower, cilindricalCapacity,
                numberOfKilometres, consumption, priceToFull, fuel);

        this.trunkCapacity = trunkCapacity;
    }

    public Break(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    public Break() {
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public String toString() {
        return "Break{" +
                "trunkCapacity=" + trunkCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", euro=" + euro +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", cilindricalCapacity=" + cilindricalCapacity +
                ", numberOfKilometres=" + numberOfKilometres +
                ", fuel=" + fuel +
                '}';
    }
}
