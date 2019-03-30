package com.fmi.project.car;

import com.fmi.project.fuel.*;

public abstract class Car implements Comparable <Car>{

    protected String brand;

    protected String model;

    protected int euro;

    protected String color;

    protected int horsePower;

    protected int cilindricalCapacity;

    protected long numberOfKilometres;

    protected double consumption;

    protected int priceToFull;

    protected Fuel fuel;

    public Car(String brand, String model, int euro,
               String color, int horsePower, int cilindricalCapacity,
               long numberOfKilometres, double consumption, int priceToFull, Fuel fuel) {
        this.brand = brand;
        this.model = model;
        this.euro = euro;
        this.color = color;
        this.horsePower = horsePower;
        this.cilindricalCapacity = cilindricalCapacity;
        this.numberOfKilometres = numberOfKilometres;
        this.consumption = consumption;
        this.priceToFull = priceToFull;
        this.fuel = fuel;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEuro() {
        return euro;
    }

    public void setEuro(int euro) {
        this.euro = euro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCilindricalCapacity() {
        return cilindricalCapacity;
    }

    public void setCilindricalCapacity(int cilindricalCapacity) {
        this.cilindricalCapacity = cilindricalCapacity;
    }

    public long getNumberOfKilometres() {
        return numberOfKilometres;
    }

    public void setNumberOfKilometres(long numberOfKilometres) {
        this.numberOfKilometres = numberOfKilometres;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    @Override
    public int compareTo(Car car) {
       return this.getBrand().compareTo(car.brand);
    }
}
