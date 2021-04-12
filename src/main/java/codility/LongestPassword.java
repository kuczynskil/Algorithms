package main.java.codility;

public class LongestPassword {

//    You would like to set a password for a bank account. However, there are three restrictions on the format of the password:
//
//it has to contain only alphanumerical characters (a−z, A−Z, 0−9);
//there should be an even number of letters;
//there should be an odd number of digits.
//You are given a string S consisting of N characters. String S can be divided into words by
// splitting it at, and removing, the spaces. The goal is to choose the longest word that is a
// valid password. You can assume that if there are K spaces in string S then there are exactly K + 1 words.
//
//For example, given "test 5 a0A pass007 ?xy1", there are five words and three of them are valid
// passwords: "5", "a0A" and "pass007". Thus the longest password is "pass007" and its length is 7.
// Note that neither "test" nor "?xy1" is a valid password, because "?" is not an alphanumerical character and "test" contains an even number of digits (zero).
//
//Write a function:
//
//class Solution { public int solution(String S); }
//
//that, given a non-empty string S consisting of N characters, returns the length of the longest word
// from the string that is a valid password. If there is no such word, your function should return −1.
//
//For example, given S = "test 5 a0A pass007 ?xy1", your function should return 7, as explained above.
//
//Assume that:
//
//N is an integer within the range [1..200];
//string S consists only of printable ASCII characters and spaces.
//In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

    public int solution(String S) {
        int res = -1;
        for (String s : S.split(" ")) {
            if (isValid(s)) res = Math.max(res, s.length());
        }
        return res;
    }

    public static boolean isValid(String password) {
        int numbers = 0;
        int letters = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) return false;
            if (Character.isLetter(c)) letters++;
            else numbers++;
        }
        return numbers % 2 == 1 && letters % 2 == 0;
    }
}
