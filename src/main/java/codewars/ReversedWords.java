package main.java.codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedWords {

//    Complete the solution so that it reverses all of the words within the string passed in.
//
//Example:
//
//ReverseWords.reverseWords("The greatest victory is that which requires no battle");
//// should return "battle no requires which that is victory greatest The"

    public static String reverseWords(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    public static void main(String[] args) {

    }
}
