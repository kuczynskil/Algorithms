package main.java;

import java.util.HashMap;
import java.util.Map;

public class CountConstruct {

    public static int countConstruct(String target, String[] elements, Map<String, Integer> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.isEmpty()) return 1;
        int count = 0;
        for (String element : elements) {
            if (target.indexOf(element) == 0) {
                String remainder = target.substring(element.length());
                int numWaysForRest = countConstruct(remainder, elements, memo);
                count += numWaysForRest;
            }
        }
        memo.put(target, count);
        return count;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        System.out.println(countConstruct("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"},
                map));
    }
}
