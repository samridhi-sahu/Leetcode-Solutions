
// 1403. Minimum Subsequence in Non-Increasing Order
// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/description/
import java.util.*;

public class Qno1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int i = nums.length - 1;
        int subsum = 0;
        while (i >= 0) {
            subsum += nums[i];
            if (subsum > sum - subsum)
                break;
            i--;
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = nums.length - 1; j > i - 1; j--) {
            ans.add(nums[j]);
        }
        return ans;
    }
}
