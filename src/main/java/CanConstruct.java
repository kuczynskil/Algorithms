package main.java;

public class CanConstruct {

    public static boolean canConstruct(String target, String[] elements) {
        if (target.isEmpty()) return true;
        for (String element : elements) {
            if (target.indexOf(element) == 0) {
                String remainder = target.substring(element.length());
                if (canConstruct(remainder, elements)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("skateboard", new String[] {"ab", "abc", "bc", "skateboard", "111"}));
    }
}

