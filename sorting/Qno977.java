// 977. Squares of a Sorted Array
// https://leetcode.com/problems/squares-of-a-sorted-array/description/
public class Qno977 {
    public int[] sortedSquares(int[] nums) {
        // tc nlogn
        // for(int i=0;i<nums.length;i++){
        // nums[i]*=nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        // tc n
        int[] ans = new int[nums.length];
        int i = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[i--] = nums[left] * nums[left];
                left++;
            } else {
                ans[i--] = nums[right] * nums[right];
                right--;
            }
        }
        return ans;
    }
}
