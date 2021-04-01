package main.java.codility;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingInteger {

//    This is a demo task.
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//Given A = [1, 2, 3], the function should return 4.
//
//Given A = [−1, −3], the function should return 1.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [−1,000,000..1,000,000].

    public static int solution(int[] A) {
        ArrayList<Integer> numbers = IntStream.of(A)
                .boxed()
                .filter(x -> x > 0)
                .sorted()
                .distinct()
                .collect(Collectors.toCollection(ArrayList<Integer>::new));

        if (numbers.isEmpty()) return 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != i + 1)
                return i + 1;
        }
        return numbers.size() + 1;
    }
}

