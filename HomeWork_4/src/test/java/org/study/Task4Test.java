package org.study;

import org.junit.Test;
import org.study.Task4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void shouldCreateLinearCongruentialGenerator() {
        Long[] resultGenerator = Task4.createIterateRandom(7, 7, 7, 10)
                .limit(10)
                .toArray(Long[]::new);
        Long[] actualGenerator = {7L, 6L, 9L, 0L, 7L, 6L, 9L, 0L, 7L, 6L};
        assertThat(resultGenerator, equalTo(actualGenerator));
    }
}
