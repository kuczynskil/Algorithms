package main.java.codewars;

import java.util.*;

public class SumByFactors {

    public static String sumOfDivided(int[] l) {
        int max = Arrays.stream(l).map(Math::abs).max().getAsInt();
        List<Integer> primeNumbers = primeNumbersEratosthenesSieve(max);
        List<List<Integer>> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (Integer primeNumber : primeNumbers) {
            result.add(new ArrayList<>(Collections.singletonList(primeNumber)));
        }

        for (int j = 0; j < primeNumbers.size(); j++) {
            List<Integer> list = result.get(j);
            for (int k : l) {
                if ((primeNumbers.get(j) <= Math.abs(k)) && k % primeNumbers.get(j) == 0) {
                    if (list.size() == 1) list.add(0);
                    list.set(1, list.get(1) + k);
                }
            }
        }

        for (List<Integer> list : result) {
            if (list.size() == 2) {
                sb.append("(" + list.get(0) + " " + list.get(1) + ")");
            }
        }
        return sb.toString();
    }

    public static List<Integer> primeNumbersEratosthenesSieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNums = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNums.add(i);
            }
        }
        return primeNums;
    }

    public static void main(String[] args) {
        System.out.println(primeNumbersEratosthenesSieve(3));
        System.out.println(sumOfDivided(new int[]{-1, -2, -3, 2, 60}));
    }
}
