package org.study;

import java.util.stream.Stream;

public class Task4 {
//    Using Stream.iterate, make an infinite stream of random numbers — not by calling
//    Math.random but by directly implementing a linear congruential generator.
//    In such a generator, you start with x[0] = seed and then produce x[n + 1] = 1 (a x[n] + c) % m,
//    for appropriate values of a, c, and m. You should implement a method with parameters a, c, m, and seed
//    that yields a Stream<Long>. Try out a = 25214903917, c = 11, and m = 2^48.

    public static void main(String[] args) {
        createIterateRandom(0, 25214903917L, 11, 2 ^ 48).limit(10).forEach(System.out::println);
    }

    public static Stream<Long> createIterateRandom(long seed, long a, long c, long m) {
        return Stream.iterate(seed, (x) -> (a * x + c) % m);
    }
}
