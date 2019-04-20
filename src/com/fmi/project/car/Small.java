package com.fmi.project.car;

import com.fmi.project.fuel.Fuel;

public class Small extends Car {

    public Small(String brand, String model, int euro, String color,
                 int horsePower, int cilindricalCapacity, long numberOfKilometres,
                 double consumption, int priceToFull, Fuel fuel) {

        super(brand, model, euro, color, horsePower, cilindricalCapacity,
                numberOfKilometres, consumption, priceToFull, fuel);

    }

    public Small() {
    }
}
