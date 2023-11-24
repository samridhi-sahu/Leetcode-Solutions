public class MinimumSubsetSumDiff {
    public int minDifference(int nums[], int n) {
        int w = 0;
        for (int i = 0; i < n; i++) {
            w += nums[i];
        }
        boolean[][] t = new boolean[n + 1][w + 1];
        for (int i = 0; i < w + 1; i++) {
            t[0][i] = false;
        }
        for (int i = 0; i < n + 1; i++) {
            t[i][0] = true;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (nums[i - 1] <= j)
                    t[i][j] = t[i - 1][j] || t[i - 1][j - nums[i - 1]];
                else
                    t[i][j] = t[i - 1][j];
            }
        }
        int min = w;
        for (int i = 0; i <= w / 2; i++) {
            if (t[n][i] && min >= w - 2 * i)
                min = w - 2 * i;
        }
        return min;
    }
}
