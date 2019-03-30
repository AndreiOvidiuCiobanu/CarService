package com.fmi.project.car;

import com.fmi.project.fuel.Fuel;

public class Coupe extends Car {

    private int timeTo100;

    private boolean hasCeramicbBrakes;

    private boolean hasAkrapovicExhaust;

    public Coupe(String brand, String model, int euro, String color,
                 int horsePower, int cilindricalCapacity, long numberOfKilometres,
                 double consumption, int priceToFull, int timeTo100,
                 boolean hasCeramicbBrakes, boolean hasAkrapovicExhaust, Fuel fuel) {

        super(brand, model, euro, color, horsePower, cilindricalCapacity,
                numberOfKilometres, consumption, priceToFull, fuel);

        this.timeTo100 = timeTo100;
        this.hasCeramicbBrakes = hasCeramicbBrakes;
        this.hasAkrapovicExhaust = hasAkrapovicExhaust;
    }

    public Coupe(int timeTo100, boolean hasCeramicbBrakes, boolean hasAkrapovicExhaust) {
        this.timeTo100 = timeTo100;
        this.hasCeramicbBrakes = hasCeramicbBrakes;
        this.hasAkrapovicExhaust = hasAkrapovicExhaust;
    }

    public Coupe() {
    }

    public int getTimeTo100() {
        return timeTo100;
    }

    public void setTimeTo100(int timeTo100) {
        this.timeTo100 = timeTo100;
    }

    public boolean isHasCeramicbBrakes() {
        return hasCeramicbBrakes;
    }

    public void setHasCeramicbBrakes(boolean hasCeramicbBrakes) {
        this.hasCeramicbBrakes = hasCeramicbBrakes;
    }

    public boolean isHasAkrapovicExhaust() {
        return hasAkrapovicExhaust;
    }

    public void setHasAkrapovicExhaust(boolean hasAkrapovicExhaust) {
        this.hasAkrapovicExhaust = hasAkrapovicExhaust;
    }
}
