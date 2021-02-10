package main.java.tabulation;

public class Fibonacci {

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
        System.out.println(fib(50));
    }
}
