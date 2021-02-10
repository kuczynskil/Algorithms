package main.java.tabulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowSum {

    public static int[] howSum(int targetSum, int[] numbers) {
        List<int[]> table = new ArrayList<>(Collections.nCopies(targetSum + 1, new int[1]));
        table.set(0, new int[0]);
        for (int i = 0; i <= targetSum; i++) {
            if (!Arrays.equals(new int[1], table.get(i))) {
                for (int num : numbers) {
                    if (i + num <= targetSum) {
                        table.set(i + num, addElementToArray(table.get(i), num));
                    }
                }
            }
        }
        return table.get(targetSum);
    }

    public static int[] addElementToArray(int[] inputTable, int element) {
        int[] newArray = Arrays.copyOf(inputTable, inputTable.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(howSum(5, new int[]{2,2})));

    }
}



