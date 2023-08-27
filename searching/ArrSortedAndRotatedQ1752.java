// 1752. Check if Array Is Sorted and Rotated
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class ArrSortedAndRotatedQ1752 {
    public boolean check(int[] nums) {
        int k = 0;
        for (k = 1; k < nums.length; k++) {
            if (nums[k] < nums[k - 1])
                break;
        }
        k = k % nums.length; // index of breaking rule
        for (int i = 0, j = k - 1; i < k && j >= 0 && i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = k, j = nums.length - 1; i < nums.length && j >= 0 && i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = 0, j = nums.length - 1; i < nums.length && j >= 0 && i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i])
                return false;
        }
        return true;
    }
}
