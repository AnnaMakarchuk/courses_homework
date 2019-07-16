package com.Anna.Composite_02;

public class CompositeCalculate {
    public int calculateExpression(int[] data) {
        Composite composite = new Plus(
                new Multiplication(new Plus(new Number(data[0]), new Number(data[1])), new Number(data[2])),
                new Multiplication(new Number(data[3]), new Plus(new Number(data[4]), new Number(data[5]))));
        return composite.expression();
    }
}
