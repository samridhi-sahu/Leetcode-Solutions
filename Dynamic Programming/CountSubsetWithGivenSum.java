public class CountSubsetWithGivenSum {
    public int perfectSum(int arr[], int n, int sum) {
        int mod = 1000000007;
        int w = sum;
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
