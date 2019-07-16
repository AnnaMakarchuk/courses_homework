package com.Anna.Composite_02;

public class TestCompositePattern {
    public static void main(String[] args) {
        CompositeCalculate compositeCalculate = new CompositeCalculate();
        int[] data = new int[]{1, 2, 4, 5, 3, 6};
        int[] data2 = new int[]{0, 1, 2, 3, 4, 5};
        int total = compositeCalculate.calculateExpression(data2);
        System.out.println("Expression (1+2)*4+5*(3+6) has total value " + total);
    }
}
