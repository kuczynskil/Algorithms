package main.java.leetcode;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == remainder) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
