package main.java.codewars;

import java.util.List;

public class SumMixedArray {


    public int sum(List<?> mixed) {
        return mixed.stream()
                    .mapToInt(el -> Integer.parseInt(String.valueOf(el)))
                    .sum();

    }

    public static void main(String[] args) {

    }
}
