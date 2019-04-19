package com.Anna.Composite_02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PlusTest {

    @Mock
    private Composite firstValue;

    @Mock
    private Composite secondValue;

    @Test
    public void shouldPlus() {
        when(firstValue.expression()).thenReturn(3);
        when(secondValue.expression()).thenReturn(4);
        Composite plus = new Plus(firstValue, secondValue);
        int result = plus.expression();
        assertThat(result, equalTo(7));
    }

}