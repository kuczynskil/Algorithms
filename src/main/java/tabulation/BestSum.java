package main.java.tabulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BestSum {

    public static int[] bestSum(int targetSum, int[] numbers) {
        List<int[]> table = new ArrayList<>(Collections.nCopies(targetSum + 1, null));
        table.set(0, new int[0]);
        for (int i = 0; i <= targetSum; i++) {
            if (null != table.get(i)) {
                for (int num : numbers) {
                    int[] arrayToBeInserted = addElementToArray(table.get(i), num);
                    if (i + num <= targetSum &&
                            (null == table.get(i + num) || arrayToBeInserted.length < table.get(i + num).length)) {
                            table.set(i + num, arrayToBeInserted);
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
        System.out.println(Arrays.toString(bestSum(8, new int[]{1,2,3,5,8})));

    }
}
