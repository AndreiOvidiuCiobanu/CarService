package com.fmi.project.fuel;

public class Gasoline extends Fuel {

    private String isTurboOrAspirate;

    public Gasoline(boolean mayHaveProblems,
                    boolean mayBeForbidden, String isTurboOrAspirate) {
        super(mayHaveProblems, mayBeForbidden);
        this.isTurboOrAspirate = isTurboOrAspirate;
    }

    public Gasoline() {
    }

    public Gasoline(String isTurboOrAspirate) {
        this.isTurboOrAspirate = isTurboOrAspirate;
    }

    public String isTurboOrAspirate() {
        return isTurboOrAspirate;
    }

    public void setTurboOrAspirate(String turboOrAspirate) {
        isTurboOrAspirate = turboOrAspirate;
    }

    @Override
    public String toString() {
        return "Gasoline{" +
                "isTurboOrAspirate=" + isTurboOrAspirate +
                ", mayHaveProblems=" + mayHaveProblems +
                ", mayBeForbidden=" + mayBeForbidden +
                '}';
    }
}
