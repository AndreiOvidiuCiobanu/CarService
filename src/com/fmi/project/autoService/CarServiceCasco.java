package com.fmi.project.autoService;

import com.fmi.project.car.Car;

public class CarServiceCasco extends CarService {

    private boolean isFullyInsured;

    private boolean observationWasMade;

    private int additionalCosts;

    public CarServiceCasco(Car car, int cost, int duration,
                           boolean isFullyInsured, boolean observationWasMade,
                           int additionalCosts) {
        super(car, cost, duration);
        this.isFullyInsured = isFullyInsured;
        this.observationWasMade = observationWasMade;
        this.additionalCosts = additionalCosts;
    }

    public CarServiceCasco(boolean isFullyInsured, boolean observationWasMade, int additionalCosts) {
        this.isFullyInsured = isFullyInsured;
        this.observationWasMade = observationWasMade;
        this.additionalCosts = additionalCosts;
    }

    public boolean isFullyInsured() {
        return isFullyInsured;
    }

    public void setFullyInsured(boolean fullyInsured) {
        isFullyInsured = fullyInsured;
    }

    public boolean isObservationWasMade() {
        return observationWasMade;
    }

    public void setObservationWasMade(boolean observationWasMade) {
        this.observationWasMade = observationWasMade;
    }

    public int getAdditionalCosts() {
        return additionalCosts;
    }

    public void setAdditionalCosts(int additionalCosts) {
        this.additionalCosts = additionalCosts;
    }
}
