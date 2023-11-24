
// 2733. Neither Minimum nor Maximum
// https://leetcode.com/problems/neither-minimum-nor-maximum/description/
public class Q2733 {
    public int findNonMinOrMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i])
                min = nums[i];
            if (max < nums[i])
                max = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != min && nums[i] != max)
                return nums[i];
        }
        return -1;
    }
}
