package main.java.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class RemovedNums {

    public static List<long[]> removNb(long n) {
        List<long[]> result = new ArrayList<>();
        long sum = LongStream.rangeClosed(1,n).sum();
        for (long a = 1; a <= n; a++) {
            long checkedSum = sum - a;
            double b = (double) checkedSum / (a + 1);
            if (b % 1 == 0 && b < n) {
                result.add(new long[] {a, (long) b});
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<long[]> test = removNb(26);
        for (long[] longs : test) {
            System.out.println(Arrays.toString(longs));
        }
    }
}
