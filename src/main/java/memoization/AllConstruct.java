package main.java.memoization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllConstruct {

    public static String[][] allConstruct(String target, String[] elements, Map<String, String[][]> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.isEmpty()) return new String[][]{{}};

        String[][] result = new String[][] {{}};
        for (String element : elements) {
            if (target.indexOf(element) == 0) {
                String remainder = target.substring(element.length());
                String[][] remainderWays = allConstruct(remainder, elements, memo);
                for (String[] targetWay : remainderWays) {
                    targetWay = addToBeginningOfArray(targetWay, element);
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = targetWay;
                }
            }
        }
        memo.put(target, result);
        return result;
    }

    public static String[] addToBeginningOfArray(String[] elements, String element) {
        String[] newArray = Arrays.copyOf(elements, elements.length + 1);
        newArray[0] = element;
        System.arraycopy(elements, 0, newArray, 1, elements.length);
        return newArray;
    }

    public static void main(String[] args) {
        Map<String, String[][]> map = new HashMap<>();
        String[][] result = allConstruct("enterapotentpot",
                new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}, map);
        for (String[] strings : result) {
            System.out.print("\n[");
            System.out.print(String.join(", ", strings));
            System.out.print("]");
        }
    }
}
