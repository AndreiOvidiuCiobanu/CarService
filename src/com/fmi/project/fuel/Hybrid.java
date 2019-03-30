package com.fmi.project.fuel;

public class Hybrid extends Fuel{

    protected int numberOfKilometresInElectricMode;

    public Hybrid(boolean mayHaveProblems, boolean mayBeForbidden,
                  int numberOfKilometresInElectricMode) {
        super( mayHaveProblems, mayBeForbidden);
        this.numberOfKilometresInElectricMode = numberOfKilometresInElectricMode;
    }

    public Hybrid() {
    }

    public Hybrid(int numberOfKilometresInElectricMode) {
        this.numberOfKilometresInElectricMode = numberOfKilometresInElectricMode;
    }

    public int getNumberOfKilometresInElectricMode() {
        return numberOfKilometresInElectricMode;
    }

    public void setNumberOfKilometresInElectricMode(int numberOfKilometresInElectricMode) {
        this.numberOfKilometresInElectricMode = numberOfKilometresInElectricMode;
    }

    @Override
    public String toString() {
        return "Hybrid{" +
                "numberOfKilometresInElectricMode=" + numberOfKilometresInElectricMode +
                ", mayHaveProblems=" + mayHaveProblems +
                ", mayBeForbidden=" + mayBeForbidden +
                '}';
    }
}
