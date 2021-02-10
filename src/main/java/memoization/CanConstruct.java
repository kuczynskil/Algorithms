package main.java.memoization;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {

    public static boolean canConstruct(String target, String[] elements, Map<String, Boolean> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.isEmpty()) return true;
        for (String element : elements) {
            if (target.indexOf(element) == 0) {
                String remainder = target.substring(element.length());
                if (canConstruct(remainder, elements, memo)) {
                    memo.put(target, true);
                    return true;
                }
            }
        }
        memo.put(target, false);
        return false;
    }

    public static void main(String[] args) {
        Map<String, Boolean> map = new HashMap<>();
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] {"e", "abeeec", "eee",
                "eeeeeeeeee", "ee"}, map));
    }
}

