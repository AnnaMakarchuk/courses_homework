package com.Anna.Composite_02;

public class TestCompositePattern {
    public static void main(String[] args) {
        int[] data = new int[]{1,2,4,5,3,6};
        int total = TestCompositePattern.calculateExpression(data).expression();
        System.out.println("Expression (1+2)*4+5*(3+6) has total value " + total);
    }

    private static Composite calculateExpression(int[] data) {
        return new Plus(new Multiplication(new Plus(new Number(data[0]), new Number(data[1])), new Number(data[2])),
                new Multiplication(new Number(data[3]), new Plus(new Number(data[4]), new Number(data[5]))));
    }
}
