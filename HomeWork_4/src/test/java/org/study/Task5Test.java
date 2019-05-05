package org.study;

import org.junit.Test;
import org.study.Task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class Task5Test {

    @Test
    public void shouldCreateConcatStreamInteger() {
        Stream<Integer> first = Stream.of(2, 10);
        Stream<Integer> second = Stream.of(410, 85, 32);
        List<Integer> result = Task5.zip(first, second).collect(Collectors.toList());
        List<Integer> expected = Stream.of(2, 410, 10, 85).collect(Collectors.toList());
        assertThat(result, equalTo(expected));
    }

    @Test
    public void shouldCreateConcatStreamString() {
        Stream<String> first = Stream.of("A1", "A2", "A3");
        Stream<String> second = Stream.of("B1");
        List<String> result = Task5.zip(first, second).collect(Collectors.toList());
        List<String> expected = Stream.of("A1", "B1").collect(Collectors.toList());
        assertThat(result, equalTo(expected));
    }
}
