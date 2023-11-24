// 922. Sort Array By Parity II
// https://leetcode.com/problems/sort-array-by-parity-ii/description/
public class Qno922 {
    public int[] sortArrayByParityII(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 != nums[i] % 2) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (j % 2 != nums[j] % 2 && i % 2 == nums[j] % 2) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
