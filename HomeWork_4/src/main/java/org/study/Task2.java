package org.study;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    //The method map list of string to uppercase and then sort descending.

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Anna");
        list.add("city");
        list.add("KYIV");
        list.add("Lviv");
        upperCaseDescend(list);
    }

    public static void upperCaseDescend(List<String> list) {
        list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
