package main.java.codewars;

public class MiddleChar {

    public static String getMiddle(String word) {
        if (word.length() == 1) return word;
        if (word.length() % 2 != 0) return Character.toString(word.charAt(word.length() / 2));
        return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
    }

    public static void main(String[] args) {
        System.out.println((int) Math.ceil(7 / 2.0));
    }
}
