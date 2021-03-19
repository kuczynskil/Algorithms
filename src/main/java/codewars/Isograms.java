package main.java.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Isograms {

//    An isogram is a word that has no repeating letters, consecutive or non-consecutive.
//    Implement a function that determines whether a string that contains only letters is an
//    isogram. Assume the empty string is an isogram. Ignore letter case.
//
//isIsogram "Dermatoglyphics" == true
//isIsogram "aba" == false
//isIsogram "moOse" == false -- ignore letter case

    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        return str.equals(Arrays.stream(str.split("")).distinct().collect(Collectors.joining()));
    }

    public static void main(String[] args) {
        String string = "ababbb123";
        String second = Arrays.stream(string.split("")).distinct().collect(Collectors.joining());
        String av = "ab123";
        System.out.println(second);
        System.out.println(second.equals(av));
    }
}
