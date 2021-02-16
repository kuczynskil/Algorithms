package main.java.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KPrimes {

    public static long[] countKprimes(int k, long start, long end) {
        long[] result = new long[0];
        for (long i = start; i <= end; i++) {
            if (primeFactors((int) i).size() == k) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = i;
            }
        }
        return result;
    }

    public static List<Integer> primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    public static int puzzle(int s) {
        long[] k1Primes = countKprimes(1, 0, s);
        long[] k3Primes = countKprimes(3, 0, s);
        long[] k7Primes = countKprimes(7, 0, s);
        int solutionsCount = 0;
        for (long k1Prime : k1Primes) {
            for (long k3Prime : k3Primes) {
                long remainder = s - k1Prime - k3Prime;
                if (Arrays.stream(k7Primes).anyMatch(el -> el == remainder)) solutionsCount++;
            }
        }
        return solutionsCount;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countKprimes(2, 0, 100)));
        System.out.println(puzzle(143));
    }
}
