package main.java.codewars;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthDifference {

//    You are given two arrays a1 and a2 of strings. Each string is composed with letters from
//    a to z. Let x be any string in the first array and y be any string in the second array.
//
//Find max(abs(length(x) − length(y)))
//
//If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).
//
//Example:
//a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
//a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
//mxdiflg(a1, a2) --> 13
//Bash note:
//input : 2 strings with substrings separated by ,
//output: number as a string

    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) return -1;
        Arrays.sort(a1, Comparator.comparing(String::length));
        Arrays.sort(a2, Comparator.comparing(String::length).reversed());
        return Math.max(a2[0].length() - a1[0].length(), a1[a1.length - 1].length() - a2[a2.length - 1].length());
    }

    public static void main(String[] args) {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        System.out.println(mxdiflg(s1, s2));
    }
}
