package com.fmi.project.autoService;

import com.fmi.project.car.Car;

import java.util.List;

public class CarServiceTuning extends CarService {

    private String componentsForTuning;

    public CarServiceTuning(Car car, int cost, int duration, String componentsForTuning) {
        super(car, cost, duration);
        this.componentsForTuning = componentsForTuning;
    }

    public CarServiceTuning(String componentsForTuning) {
        this.componentsForTuning = componentsForTuning;
    }

    public String getComponentsForTuning() {
        return componentsForTuning;
    }

    public void setComponentsForTuning(String componentsForTuning) {
        this.componentsForTuning = componentsForTuning;
    }
}
