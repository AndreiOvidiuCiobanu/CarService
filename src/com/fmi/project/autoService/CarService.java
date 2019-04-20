package com.fmi.project.autoService;

import com.fmi.project.car.Car;

public abstract class CarService implements Comparable<CarService> {

    protected Car car;

    protected int cost;

    protected int duration;

    public CarService(Car car, int cost, int duration) {
        this.car = car;
        this.cost = cost;
        this.duration = duration;
    }

    public CarService() {
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int compareTo(CarService carService) {
        return Integer.compare(this.duration, carService.duration);
    }
}
