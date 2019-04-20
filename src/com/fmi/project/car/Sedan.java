package com.fmi.project.car;

import com.fmi.project.fuel.Fuel;

public class Sedan extends Car {

    private int trunkCapacity;

    private boolean hasAirSuspension;

    public Sedan(String brand, String model, int euro, String color,
                 int horsePower, int cilindricalCapacity, long numberOfKilometres,
                 double consumption, int priceToFull, Fuel fuel, int trunkCapacity,
                 boolean hasAirSuspension) {

        super(brand, model, euro, color, horsePower, cilindricalCapacity,
                numberOfKilometres, consumption, priceToFull, fuel);

        this.trunkCapacity = trunkCapacity;
        this.hasAirSuspension = hasAirSuspension;
    }

//    public Sedan(int trunkCapacity, boolean hasAirSuspension) {
//        this.trunkCapacity = trunkCapacity;
//        this.hasAirSuspension = hasAirSuspension;
//    }

    public Sedan() {
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    public boolean isHasAirSuspension() {
        return hasAirSuspension;
    }

    public void setHasAirSuspension(boolean hasAirSuspension) {
        this.hasAirSuspension = hasAirSuspension;
    }
}
