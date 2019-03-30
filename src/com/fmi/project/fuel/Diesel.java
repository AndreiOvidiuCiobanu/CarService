package com.fmi.project.fuel;

public class Diesel extends Fuel{

    private int numberOfTurbines;

    public Diesel( boolean mayHaveProblems,
                  boolean mayBeForbidden, int numberOfTurbines) {
        super(mayHaveProblems, mayBeForbidden);
        this.numberOfTurbines = numberOfTurbines;
    }

    public Diesel(int numberOfTurbines) {
        this.numberOfTurbines = numberOfTurbines;
    }

    public int getNumberOfTurbines() {
        return numberOfTurbines;
    }

    public Diesel() {

    }

    public void setNumberOfTurbines(int numberOfTurbines) {
        this.numberOfTurbines = numberOfTurbines;
    }

    @Override
    public String toString() {
        return "Diesel{" +
                "numberOfTurbines=" + numberOfTurbines +
                ", mayHaveProblems=" + mayHaveProblems +
                ", mayBeForbidden=" + mayBeForbidden +
                '}';
    }
}
