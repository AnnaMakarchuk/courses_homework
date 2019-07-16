package com.Anna.Composite_02;

public abstract class Operations implements Composite {

    private Composite secondValue;
    private Composite firstValue;

    public Operations(Composite firstValue, Composite secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public Composite getSecondValue() {
        return secondValue;
    }

    public Composite getFirstValue() {
        return firstValue;
    }

    @Override
    public abstract int expression();

    @Override
    public String toString() {
        return "Operations{" +
                "secondValue=" + secondValue +
                ", firstValue=" + firstValue +
                '}';
    }
}
