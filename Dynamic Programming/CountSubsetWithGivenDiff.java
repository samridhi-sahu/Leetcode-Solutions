public class CountSubsetWithGivenDiff {
    public int countPartitions(int n, int d, int arr[]) {
        // Code here
        int mod = 1000000007;
        int w = 0;
        for (int i = 0; i < n; i++) {
            w += arr[i];
        }
        if (d > w || (d + w) % 2 != 0)
            return 0;
        w = (d + w) / 2;
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
                t[i][j] %= mod;
            }
        }
        return t[n][w] % mod;
    }
}
