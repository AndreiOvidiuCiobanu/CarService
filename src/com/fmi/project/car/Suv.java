package com.fmi.project.car;

import com.fmi.project.fuel.Fuel;

public class Suv extends Car {

    boolean hasTiresForOffRoad;

    public Suv(String brand, String model, int euro, String color, int horsePower,
               int cilindricalCapacity, long numberOfKilometres, double consumption,
               int priceToFull, Fuel fuel, boolean hasTiresForOffRoad) {

        super(brand, model, euro, color, horsePower, cilindricalCapacity,
                numberOfKilometres, consumption, priceToFull, fuel);

        this.hasTiresForOffRoad = hasTiresForOffRoad;
    }

    public Suv() {
    }

    public Suv(boolean hasTiresForOffRoad) {
        this.hasTiresForOffRoad = hasTiresForOffRoad;
    }

    public boolean isHasTiresForOffRoad() {
        return hasTiresForOffRoad;
    }

    public void setHasTiresForOffRoad(boolean hasTiresForOffRoad) {
        this.hasTiresForOffRoad = hasTiresForOffRoad;
    }
}
