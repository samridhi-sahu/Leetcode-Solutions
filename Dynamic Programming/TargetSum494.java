// 494. Target Sum

class TargetSum494 {
    public int findTargetSumWays(int[] arr, int d) {
        int w = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            w += arr[i];
        }
        if (d > w || (d + w) % 2 != 0)
            return 0;
        w = (d + w) / 2;
        if (w < 0)
            return 0;
        int[][] t = new int[n + 1][w + 1];
        for (int i = 0; i < w + 1; i++) {
            t[0][i] = 0;
        }
        t[0][0] = 1;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][w];
    }
}
