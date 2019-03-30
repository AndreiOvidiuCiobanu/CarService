package com.fmi.project.autoService;

import com.fmi.project.car.Car;

public class CarServiceInsurance extends CarService {

    private boolean isFullyInsured;

    private boolean observationWasMade;

    public CarServiceInsurance(Car car, int cost, int duration,
                               boolean isFullyInsured, boolean observationWasMade) {
        super(car, cost, duration);
        this.isFullyInsured = isFullyInsured;
        this.observationWasMade = observationWasMade;
    }

    public CarServiceInsurance(boolean isFullyInsured, boolean observationWasMade) {
        this.isFullyInsured = isFullyInsured;
        this.observationWasMade = observationWasMade;
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
}
