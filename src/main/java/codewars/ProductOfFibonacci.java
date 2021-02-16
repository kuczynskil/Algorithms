package main.java.codewars;

import java.util.Arrays;

public class ProductOfFibonacci {

    public static long[] productFib(long prod) {
        long[] result = new long[3];
        int i = 1;
        while (fib(i) * fib(i + 1) <= prod) {
            if (fib(i) * fib(i + 1) == prod) break;
            i++;
        }
        result[0] = fib(i);
        result[1] = fib(i + 1);
        result[2] = (fib(i) * fib(i + 1) == prod) ? 1 : 0;
        return result;
    }

    public static long fib(int n) {
        long[] result = new long[n + 1];
        result[1] = 1;
        for (int i = 1; i < n; i++) {
            result[i + 1] += result[i];
            if (i < n - 1) {
                result[i + 2] += result[i];
            }
        }
        return result[n];
    }

    public static void main(String[] args) {
        long[] test = productFib(714);
        System.out.println(Arrays.toString(test));
    }
}
