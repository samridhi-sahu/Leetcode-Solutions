<<<<<<< HEAD
// 1672. Richest Customer Wealth

import java.util.*;

public class Qno1672 {

    public static int maximumWealth(int[][] account) {
        int[] wealth = new int[account.length];
        int w;
        for (int i = 0; i < account.length; i++) {
            w = 0;
            for (int j = 0; j < account[0].length; j++) {
                w += account[i][j];
            }
            wealth[i] = w;
        }
        int maxwealth = wealth[0];
        for (int i = 0; i < account.length; i++) {
            if (maxwealth <= wealth[i]) {
                maxwealth = wealth[i];
            }
        }
        return maxwealth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
        int res = maximumWealth(accounts);
        System.out.println(res);
    }
}
=======
// 1672. Richest Customer Wealth

import java.util.*;

public class Qno1672 {

    public static int maximumWealth(int[][] account) {
        int[] wealth = new int[account.length];
        int w;
        for (int i = 0; i < account.length; i++) {
            w = 0;
            for (int j = 0; j < account[0].length; j++) {
                w += account[i][j];
            }
            wealth[i] = w;
        }
        int maxwealth = wealth[0];
        for (int i = 0; i < account.length; i++) {
            if (maxwealth <= wealth[i]) {
                maxwealth = wealth[i];
            }
        }
        return maxwealth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
        int res = maximumWealth(accounts);
        System.out.println(res);
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
