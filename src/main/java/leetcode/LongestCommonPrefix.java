package main.java.leetcode;

public class LongestCommonPrefix {
//    Write a function to find the longest common prefix string amongst an array of strings.
//
//    If there is no common prefix, return an empty string "".
//
//
//
//    Example 1:
//
//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
//    Example 2:
//
//    Input: strs = ["dog","racecar","car"]
//    Output: ""
//    Explanation: There is no common prefix among the input strings.

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String prefix = strs[0];
        for (int i = 0; i < strs.length - 1; i++) {
            String analyzed = strs[i + 1];
            StringBuilder tmpPrefix = new StringBuilder();
            for (int j = 0; j < Math.min(prefix.length(), analyzed.length()); j++) {
                if (prefix.charAt(j) == analyzed.charAt(j)) tmpPrefix.append(prefix.charAt(j));
                else break;
            }
            prefix = tmpPrefix.toString();
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"cir","car"}));
    }
}
