package org.study;

import java.util.Iterator;
import java.util.stream.Stream;

public class Task5 {
//    Write a method public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
//    that alternates elements from the stream first and second,
//    stopping when one of them runs out of elements.

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(2, 10, 45, 1, 0);
        Stream<Integer> second = Stream.of(410, 85, 32, 314, 12);
        zip(first, second).forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        Stream<T> concatStream = Stream.empty();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            concatStream = Stream.concat(concatStream, Stream.of(firstIterator.next(), secondIterator.next()));
        }
        return concatStream;
    }
}
