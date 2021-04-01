package main.java.codility;

public class StrSymmetry {

//    rite a function:
//
//class Solution { public int solution(String S); }
//
//that, given a string S, returns the index (counting from 0) of a character
// such that the part of the string to the left of that character is a reversal of
// the part of the string to its right. The function should return −1 if no such index exists.
//
//Note: reversing an empty string (i.e. a string whose length is zero) gives an empty string.
//
//For example, given a string:
//
//"racecar"
//
//the function should return 3, because the substring to the left of the character "e" at index 3 is "rac", and the one to the right is "car".
//
//Given a string:
//
//"x"
//
//the function should return 0, because both substrings are empty.
//
//Write an efficient algorithm for the following assumptions:
//
//the length of S is within the range [0..2,000,000].

    public int solution(String S) {
        if (S.length() % 2 == 0) return -1;

        int middleCharIndex = S.length() / 2;
        return (S.substring(0, middleCharIndex).equals(new StringBuilder(S.substring(middleCharIndex + 1)).reverse().toString())) ? middleCharIndex : -1;
    }

    public static void main(String[] args) {
        System.out.println(new StrSymmetry().solution("racecar2"));
    }
}
