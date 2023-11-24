// 905. Sort Array By Parity
// https://leetcode.com/problems/sort-array-by-parity/description/
public class Qno905 {
    public int[] sortArrayByParity(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                even++;
        }
        if (even == 0)
            return nums;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] % 2 == 0)
                i++;
            else
                rotate(nums, i, nums.length);
            if (i == even)
                return nums;
        }
        return nums;
    }

    void rotate(int[] nums, int i, int n) {
        for (int j = i + 1, k = n - 1; j < k; j++, k--) {
            int temp = nums[j];
            nums[j] = nums[k];
            nums[k] = temp;
        }
        for (int j = i, k = n - 1; j < k; j++, k--) {
            int temp = nums[j];
            nums[j] = nums[k];
            nums[k] = temp;
        }
    }
}
