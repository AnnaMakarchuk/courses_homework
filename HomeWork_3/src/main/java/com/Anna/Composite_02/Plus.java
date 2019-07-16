package com.Anna.Composite_02;

public class Plus extends Operations {

    public Plus(Composite firstValue, Composite secondValue) {
        super(firstValue, secondValue);
    }

    public int expression() {
        return super.getFirstValue().expression() + super.getSecondValue().expression();
    }
}
