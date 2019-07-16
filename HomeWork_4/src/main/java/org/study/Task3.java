package org.study;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
//    Given  and collection = Arrays.asList ("1, 2, 0", "4, 5")
//    From the collection get all the numbers listed, separated by commas from all the elements

    public static void main(String[] args) {
        System.out.println(getString());
        System.out.println(Arrays.toString(getArrayStrings()));
    }

    private static String getString() {
        //using join method
        return Stream.of("1, 2, 0", "4, 5")
                .collect(Collectors.joining(", "));
    }

    private static String[] getArrayStrings() {
        // using flatMap
        return Stream.of("1, 2, 0", "4, 5")
                .flatMap((p) -> Arrays.stream(p.split(", ")))
                .toArray(String[]::new);
    }
}
