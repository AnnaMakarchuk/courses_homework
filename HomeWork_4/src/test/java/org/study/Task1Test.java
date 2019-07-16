package org.study;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void shouldFindOddIndexReturnString() {
        List<String> testString = new ArrayList<>();
        testString.add("AA");
        testString.add("BB");
        testString.add("CC");
        testString.add("DD");
        testString.add("EE");
        String result = Task1.firstTask(testString);
        String expected = "1.BB, 3.DD";
        assertThat(result, equalTo(expected));
    }
}
