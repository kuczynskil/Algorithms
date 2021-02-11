package main.java.tabulation;

public class CountConstruct {

    public static int countConstruct(String targetWord, String[] wordBank) {
        int[] table = new int[targetWord.length() + 1];
        table[0] = 1;

        for (int i = 0; i < table.length; i++) {
            if (table[i] > 0) {
                for (String s : wordBank) {
                    if (i + s.length() < table.length && targetWord.startsWith(s, i)) {
                        table[i + s.length()]++;
                    }
                }
            }
        }
        return table[table.length - 1];
    }
    public static void main(String[] args) {
        System.out.println(countConstruct("abc", new String[] {"a", "b", "c", "abc"}));
    }
}
