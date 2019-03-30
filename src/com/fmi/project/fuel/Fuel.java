package com.fmi.project.fuel;

public class Fuel {

    protected boolean mayHaveProblems;

    protected boolean mayBeForbidden;

    public Fuel(boolean mayHaveProblems, boolean mayBeForbidden) {
        this.mayHaveProblems = mayHaveProblems;
        this.mayBeForbidden = mayBeForbidden;
    }

    public Fuel() {
    }


    public boolean isMayHaveProblems() {
        return mayHaveProblems;
    }

    public void setMayHaveProblems(boolean mayHaveProblems) {
        this.mayHaveProblems = mayHaveProblems;
    }

    public boolean isMayBeForbidden() {
        return mayBeForbidden;
    }

    public void setMayBeForbidden(boolean mayBeForbidden) {
        this.mayBeForbidden = mayBeForbidden;
    }

    @Override
    public String toString() {
        return "fuel{" +
                "mayHaveProblems=" + mayHaveProblems +
                ", mayBeForbidden=" + mayBeForbidden +
                '}';
    }
}
