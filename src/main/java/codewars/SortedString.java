package main.java.codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedString {

//Take 2 strings s1 and s2 including only letters from ato z.
// Return a new sorted string, the longest possible, containing distinct letters -
// each taken only once - coming from s1 or s2.
//
//Examples:
//a = "xyaabbbccccdefww"
//b = "xxxxyyyyabklmopq"
//longest(a, b) -> "abcdefklmopqwxy"
//
//a = "abcdefghijklmnopqrstuvwxyz"
//longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

    public static String longest(String s1, String s2) {
        String joined = s1 + s2;
        return joined.chars()
                .distinct()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        System.out.println(longest("abcbcbaaa", "xxyyz"));
    }
}
