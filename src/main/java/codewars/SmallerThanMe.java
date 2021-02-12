package main.java.codewars;

import java.util.Arrays;

public class SmallerThanMe {

//    This is a hard version of How many are smaller than me?.
//    If you have troubles solving this one, have a look at the easier kata first.
//
//    Write
//
//    function smaller(arr)
//    that given an array arr, you have to return the amount of numbers that are smaller than arr[i] to the right.
//
//    For example:
//
//    smaller([5, 4, 3, 2, 1]) === [4, 3, 2, 1, 0]
//    smaller([1, 2, 0]) === [1, 1, 0]

    public static int[] smaller(int[] unsorted) {
        int[] result = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            int number = unsorted[i];
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < number) {
                    result[i]++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smaller(new int[]{1, 0, 3})));
    }
}
