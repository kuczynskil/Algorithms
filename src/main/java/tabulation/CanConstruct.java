package main.java.tabulation;

public class CanConstruct {

    public static boolean canConstruct(String targetWord, String[] wordBank) {
        boolean[] table = new boolean[targetWord.length() + 1];
        table[0] = true;

        for (int i = 0; i < table.length; i++) {
            if (table[i]) {
                for (String s : wordBank) {
                    String analyzed = targetWord.substring(i);
                    if (i + s.length() < table.length && analyzed.indexOf(s) == 0) {
                        table[i + s.length()] = true;
                    }
                }
            }
        }
        return table[table.length - 1];
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("abc", new String[] {"a", "b"}));
    }
}
