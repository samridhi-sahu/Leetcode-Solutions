// 2221. Find Triangular Sum of an Array
// https://leetcode.com/problems/find-triangular-sum-of-an-array/description/
public class TriangleSumQ221 {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        while (n > 1) {
            int[] temp = new int[--n];
            for (int j = 0; j < n; j++) {
                temp[j] = (nums[j] + nums[j + 1]) % 10;
            }
            for (int j = 0; j < n; j++) {
                nums[j] = temp[j];
            }
        }
        return nums[0];
    }
}
