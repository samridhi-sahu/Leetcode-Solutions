// 561. Array Partition
// https://leetcode.com/problems/array-partition/description/

import java.util.Arrays;

public class Qno561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            max += nums[i];
        }
        return max;
    }
}
