package main.java.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PandigitalSequence {

    public static long[] getSequence(final long offset, final int size) {
        List<Long> list = new ArrayList<>();
        long start = offset;
        if (start < 1023456789L) {
            start = 1023456788L;
        }

        for (long i = start; i < 9999999999L; i++) {
            if (isPandigital(i)) list.add(i);
            if (list.size() == size) break;
        }

        long[] result = new long[list.size()];

        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
        }
        return result;
    }

    public static boolean isPandigital(long num) {
        String numString = String.valueOf(num);
        for (int i = 0; i <= 9; i++) {
            if (!numString.contains(String.valueOf(i))) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSequence(0,5)));
    }
}
