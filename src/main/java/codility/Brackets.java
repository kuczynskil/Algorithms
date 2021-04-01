package main.java.codility;

import java.sql.SQLOutput;
import java.util.*;

public class Brackets {

//    A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
//
//S is empty;
//S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
//S has the form "VW" where V and W are properly nested strings.
//For example, the string "{[()()]}" is properly nested but "([)()]" is not.
//
//Write a function:
//
//class Solution { public int solution(String S); }
//
//that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
//
//For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [0..200,000];
//string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".

    public int solution(String S) {
        if (S.isEmpty()) return 1;

        Stack<Character> brackets = new Stack<>();

        for (char c : S.toCharArray()) {
            if (brackets.isEmpty()) brackets.push(c);
            else {
                if (isMatch(brackets.peek(), c)) brackets.pop();
                else brackets.push(c);
            }
        }
        return brackets.isEmpty() ? 1 : 0;
    }

    public boolean isMatch(char a, char b) {
        switch (a) {
            case '{':
                return b == '}';
            case '[':
                return b == ']';
            case '(':
                return b == ')';
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Brackets().solution("{{[}}"));
    }
}
