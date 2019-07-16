package com.Anna.Composite_02;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class CompositeCalculateTest {

    private int[] data;
    private CompositeCalculate compositeCalculate;

    @Before
    public void setUp() {
        data = new int[]{0, 1, 2, 3, 4, 5};
        compositeCalculate = new CompositeCalculate();
    }

    @Test
    public void shouldCalculateExpression() {
        int result = compositeCalculate.calculateExpression(data);
        System.out.println(result);
        assertThat(result, equalTo(29));
    }

}