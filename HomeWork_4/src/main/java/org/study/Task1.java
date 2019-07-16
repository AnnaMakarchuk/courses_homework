package org.study;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task1 {
//    The method takes a list of names. Returns a string of the form "1. Ivan, 3. Peter ...",
//    only with names on odd indices, respectively.

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Dan");
        names.add("Vova");
        names.add("Alla");
        names.add("Peter");
        names.add("Bob");
        System.out.println(firstTask(names));
    }

    public static String firstTask(List<String> names) {
        return IntStream.range(0, names.size()).filter((x) -> x % 2 != 0)
                .mapToObj((x) -> (x + "." + names.get(x)))
                .collect(Collectors.joining(", "));
    }
}
