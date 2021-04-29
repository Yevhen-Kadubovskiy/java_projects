package com.collections;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreemTest {
    public static void main(String[] args) {
        Random random = new Random();
        int streamSize = 0;
        IntStream limitWithRange = random.ints(streamSize, 0, 20);
        limitWithRange.forEach(System.out::println);
    }
}
