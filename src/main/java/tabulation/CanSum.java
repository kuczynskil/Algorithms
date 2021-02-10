package main.java.tabulation;

public class CanSum {

    public static boolean canSum(int targetSum, int[] numbers) {
        boolean[] table = new boolean[targetSum + 1];
        table[0] = true;
        for (int i = 0; i < targetSum; i++) {
            if(table[i]) {
                for (int num : numbers) {
                    if (i + num <= targetSum) table[i + num] = true;
                }
            }
        }
        return table[targetSum];
    }

    public static void main(String[] args) {
        System.out.println(canSum(5, new int[] {2}));
    }
}
