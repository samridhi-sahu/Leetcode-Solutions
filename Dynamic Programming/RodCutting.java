public class RodCutting {
    public int cutRod(int price[], int n) {
        // code here
        int[][] t = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (i <= j) {
                    t[i][j] = Math.max((price[i - 1] + t[i][j - i]), t[i - 1][j]);
                } else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][n];
    }
}
