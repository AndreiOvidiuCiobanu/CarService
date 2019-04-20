package com.fmi.project.fuel;

public class Electric extends Fuel {

    private int numberOfKilometesAutonomy;

    private int durationForFullyCharged;

    public Electric(boolean mayHaveProblems,
                    boolean mayBeForbidden,
                    int numberOfKilometesAutonomy, int durationForFullyCharged) {
        super(mayHaveProblems, mayBeForbidden);
        this.numberOfKilometesAutonomy = numberOfKilometesAutonomy;
        this.durationForFullyCharged = durationForFullyCharged;
    }

    public Electric(int numberOfKilometesAutonomy, int durationForFullyCharged) {
        this.numberOfKilometesAutonomy = numberOfKilometesAutonomy;
        this.durationForFullyCharged = durationForFullyCharged;
    }

    public Electric() {
    }

    public int getNumberOfKilometesAutonomy() {
        return numberOfKilometesAutonomy;
    }

    public void setNumberOfKilometesAutonomy(int numberOfKilometesAutonomy) {
        this.numberOfKilometesAutonomy = numberOfKilometesAutonomy;
    }

    public int getDurationForFullyCharged() {
        return durationForFullyCharged;
    }

    public void setDurationForFullyCharged(int durationForFullyCharged) {
        this.durationForFullyCharged = durationForFullyCharged;
    }

    @Override
    public String toString() {
        return "Electric{" +
                "numberOfKilometesAutonomy=" + numberOfKilometesAutonomy +
                ", durationForFullyCharged=" + durationForFullyCharged +
                ", mayHaveProblems=" + mayHaveProblems +
                ", mayBeForbidden=" + mayBeForbidden +
                '}';
    }
}
