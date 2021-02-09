package main.java;

import java.util.*;

public class WeightForWeight {
//    My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the
//    weights of members is published and each month he is the last on the list which means he is the heaviest.
//
//    I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list".
//    It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.
//
//    For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.
//
//    Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?
//
//    Example:
//            "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
//
//            "100 180 90 56 65 74 68 86 99"
//    When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers:
//
//            180 is before 90 since, having the same "weight" (9), it comes before as a string.
//
//    All numbers in the list are positive numbers and the list can be empty.

    public static String orderWeight(String string) {
        if (string.isEmpty()) return "";
        String[] weights = string.split("\\s+");
        StringBuilder result = new StringBuilder();
        Map<Integer, List<String>> treeMap = new TreeMap<>();
        for (String weight : weights) {
            treeMap.computeIfAbsent(digitSum(weight), k -> new ArrayList<>()).add(weight);
        }
        for (Map.Entry<Integer, List<String>> integerStringEntry : treeMap.entrySet()) {
            if (integerStringEntry.getValue().size() > 1) Collections.sort(integerStringEntry.getValue());
            for (String s : integerStringEntry.getValue()) {
                result.append(s + " ");
            }
        }
        return result.toString().trim();
    }

    public static int digitSum(String number) {
        long numberInt = Long.parseLong(number);
        int sum = 0;
        while (numberInt > 0) {
            int digit = (int) (numberInt % 10);
            sum += digit;
            numberInt /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}
