public class EqualSumPartition416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0)
            return false;
        int w = sum / 2;
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
                    t[i][j] = t[i - 1][j - nums[i - 1]] || t[i - 1][j];
                else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][w];
    }
}
