package com.Anna.Composite_02;

public class Multiplication extends Operations {

    public Multiplication(Composite firstValue, Composite secondValue) {
        super(firstValue, secondValue);
    }

    public int expression() {
        return super.getFirstValue().expression() * super.getSecondValue().expression();
    }
}
