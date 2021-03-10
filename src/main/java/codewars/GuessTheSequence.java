package main.java.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class GuessTheSequence {

//    You have read the title: you must guess a sequence. It will have something to do with the number given.
//
//Example
//x = 16
//
//result = [1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9]


    static int[] sequence(int x) {
        if (x < 10) return IntStream.rangeClosed(1, x).toArray();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= x / 10; i++) {
            result.add(i);
            for (int j = i * 10; j <= Math.min(i * 10 + 9, x); j++) {
                result.add(j);
            }
        }
        for (int i = x / 10 + 1; i < 10; i++) {
            result.add(i);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sequence(5)));
        System.out.println(Arrays.toString(sequence(21)));
    }
}
