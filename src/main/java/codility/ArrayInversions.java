package main.java.codility;

import java.util.Arrays;

public class ArrayInversions {

    //    An array A consisting of N integers is given. An inversion is a pair of indexes (P, Q)
//    such that P < Q and A[Q] < A[P].
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that computes the number of inversions in A, or returns −1 if it exceeds 1,000,000,000.
//
//For example, in the following array:
//
// A[0] = -1 A[1] = 6 A[2] = 3
// A[3] =  4 A[4] = 7 A[5] = 4
//there are four inversions:
//
//   (1,2)  (1,3)  (1,5)  (4,5)
//so the function should return 4.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [0..100,000];
//each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
    private static int inversions;

    public int solution(int[] A) {
        int[] sorted = mergeSort(A);
        return inversions;
    }

    private static int[] mergeSort(int[] numbers) {
        int n = numbers.length;
        if (n <= 1) return numbers;
        int mid = n / 2;
        int[] left = Arrays.copyOfRange(numbers, 0, mid);
        int[] right = Arrays.copyOfRange(numbers, mid, n);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] l, int[] r) {
        int[] merged = new int[l.length + r.length];
        int i = 0;
        int j = 0;

        for (int k = 0; k < merged.length; k++) {
            if (i >= l.length) merged[k] = r[j++];
            else if (j >= r.length) merged[k] = l[i++];
            else if (l[i] <= r[j]) merged[k] = l[i++];
            else {
                inversions++;
                merged[k] = r[j++];
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, arr.length / 2)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
    }
}
