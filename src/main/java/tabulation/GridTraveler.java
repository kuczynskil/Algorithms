package main.java.tabulation;


public class GridTraveler {

    public static int howManyWays(int n, int m) {
        int[][] table = new int[n + 1][m + 1];
        table[1][1] = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j < m) table[i][j + 1] += table[i][j];
                if (i < n) table[i + 1][j] += table[i][j];
            }
        }
        return table[n][m];
    }

    public static void main(String[] args) {
        System.out.println(howManyWays(3, 3));
    }
}
