
// 2389. Longest Subsequence With Limited Sum
// https://leetcode.com/problems/longest-subsequence-with-limited-sum/description/
import java.util.Arrays;

public class Qno2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;
        int[] ans = new int[m];
        Arrays.sort(nums);
        for (int i = 0; i < m; i++) {
            int size = 0;
            int j = 0, sum = 0;
            while (j < n) {
                if (sum + nums[j] <= queries[i]) {
                    size++;
                    sum += nums[j];
                }
                j++;
            }
            ans[i] = size;
        }
        return ans;
    }
}
