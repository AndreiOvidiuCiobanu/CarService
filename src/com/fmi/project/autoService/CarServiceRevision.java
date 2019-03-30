package com.fmi.project.autoService;

import com.fmi.project.car.Car;

public class CarServiceRevision extends CarService {

    private boolean isInWarranty;

    public CarServiceRevision(Car car, int cost, int duration, boolean isInWarranty) {
        super(car, cost, duration);
        this.isInWarranty = isInWarranty;
    }

    public CarServiceRevision(boolean isInWarranty) {
        this.isInWarranty = isInWarranty;
    }

    public boolean isInWarranty() {
        return isInWarranty;
    }

    public void setInWarranty(boolean inWarranty) {
        isInWarranty = inWarranty;
    }
}
