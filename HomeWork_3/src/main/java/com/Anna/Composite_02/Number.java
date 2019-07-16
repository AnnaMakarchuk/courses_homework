package com.Anna.Composite_02;

public class Number implements Composite {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int expression() {
        return number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
