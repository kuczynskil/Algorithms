package main.java.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingElement {
//    An array A consisting of N different integers is given.
//    The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
//
//Your goal is to find that missing element.
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A, returns the value of the missing element.
//
//For example, given array A such that:
//
//  A[0] = 2
//  A[1] = 3
//  A[2] = 1
//  A[3] = 5
//the function should return 4, as it is the missing element.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [0..100,000];
//the elements of A are all distinct;
//each element of array A is an integer within the range [1..(N + 1)].

    public int solution(int[] A) {
        Set incomplete = new HashSet();
        Arrays.stream(A).forEach(incomplete::add);
        for (int i = 1; i < incomplete.size() + 2; i++) {
            if (!incomplete.contains(i)) return i;
        }
        throw new RuntimeException("didn't find an answer");
    }

    public static void main(String[] args) {
        System.out.println(new MissingElement().solution(new int[]{2, 3, 1, 5}));
    }
}
