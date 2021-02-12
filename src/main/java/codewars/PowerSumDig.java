package main.java.codewars;

//The number 81 has a special property, a certain power of the sum of its digits is equal to 81 (nine squared).
// Eighty one (81), is the first number in having this property (not considering numbers of one digit).
// The next one, is 512. Let's see both cases with the details
//
//        8 + 1 = 9 and 92 = 81
//
//        512 = 5 + 1 + 2 = 8 and 83 = 512
//
//        We need to make a function, power_sumDigTerm(), that receives a number n and may output the n-th term of
//        this sequence of numbers. The cases we presented above means that
//
//        power_sumDigTerm(1) == 81
//
//        power_sumDigTerm(2) == 512
//
//        Happy coding!

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class PowerSumDig {

    public static long powerSumDigTerm(int n) {
        int count = 0;
        long result;
        long startNum = 80;
        while (true) {
            double numLength = String.valueOf(startNum).length();

            List<Integer> candidates = exponentCandidates((int) numLength);
            for (Integer candidate : candidates) {
                if (round(Math.pow(startNum, 1.0 / candidate), 6) % 1 == 0) {
                    if (Math.pow(digitsSum(startNum), candidate) == startNum) {
                        count++;
                    }
                }
            }
            if (count == n) {
                result = startNum;
                break;
            }
            startNum++;
        }
        return result;
    }

    public static int digitsSum(long num) {
        int sum = 0;
        while (num > 0) {
            int digit = (int) (num % 10);
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static List<Integer> exponentCandidates(int numLength) {
        List<Integer> result =  new ArrayList<>();
        for (int i = 2; i <= numLength; i++) {
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerSumDigTerm(4));
    }
}
