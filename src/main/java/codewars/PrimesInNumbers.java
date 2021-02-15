package main.java.codewars;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrimesInNumbers {


    public static String factors(int n) {
        List<Integer> primeFactors = primeFactors(n);
        Map<Integer, Long> primeOccurrences = primeFactors.stream()
                .collect(Collectors.groupingBy(p -> p, LinkedHashMap::new, Collectors.counting()));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Long> entry : primeOccurrences.entrySet()) {
            if (entry.getValue() == 1) {
                sb.append("(" + entry.getKey() + ")");

            } else {
                sb.append("(" + entry.getKey() + "**" + entry.getValue() + ")");
            }
        }
        return sb.toString();
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

    public static void main(String[] args) {
        System.out.println(factors(7775460));
    }
}
