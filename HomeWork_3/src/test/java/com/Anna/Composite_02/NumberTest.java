package com.Anna.Composite_02;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class NumberTest {

    private Composite composite;

    @Before
    public void setUp(){
        composite = new Number(4);
    }

    @Test
    public void shouldReturNumber(){
        int result = composite.expression();
        assertThat(result, equalTo(4));
    }
}