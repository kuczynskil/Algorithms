package main.java.codewars;

import java.util.Arrays;

public class Vowel2Index {

//    Write a function
//
//vowel2Index(String s)
//that takes in a string and replaces all the vowels [a,e,i,o,u] with their respective positions within that string.
//E.g:
//
//Kata.Vowel2Index("this is my string") == "th3s 6s my str15ng"
//Kata.Vowel2Index("Codewars is the best site in the world") == "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"
//Your function should be case insensitive to the vowels.

    public static String vowel2Index(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) sb.append(i + 1);
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(vowel2Index("this is my string"));
    }
}
