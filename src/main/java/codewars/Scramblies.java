package main.java.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        boolean[] table = new boolean[str2.length() + 1];
        table[0] = true;
        List<Character> availableChars = str1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        for (int i = 0; i < table.length - 1; i++) {
            if (table[i]) {
                for (int j = 0; j < availableChars.size(); j++) {
                    if (str2.charAt(i) == availableChars.get(j)) {
                        table[i + 1] = true;
                        availableChars.remove(availableChars.get(j));
                        break;
                    }
                }
            }
        }
        return table[table.length - 1];
    }

    public static boolean canConstruct(String targetWord, String[] wordBank) {
        boolean[] table = new boolean[targetWord.length() + 1];
        table[0] = true;

        for (int i = 0; i < table.length; i++) {
            if (table[i]) {
                for (String s : wordBank) {
                    if (i + s.length() < table.length && targetWord.startsWith(s, i)) {
                        table[i + s.length()] = true;
                    }
                }
            }
        }
        return table[table.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(scramble("cedewaraaossoqqyt","codewars"));

    }
}
