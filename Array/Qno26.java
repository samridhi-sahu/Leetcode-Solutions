// 26. Remove Duplicates from Sorted Array

public class Qno26 {
    public int removeDuplicates(int[] nums) {
        int x = 0;
        int count = 1;
        for (int i = 0, j = 0; i < nums.length && j < nums.length; i += count, j++) {
            count = 1;
            for (int k = i + 1; k < nums.length && nums[i] == nums[k]; k++) {
                count++;
            }
            nums[j] = nums[count - 1 + i];
            x++;
        }
        return x;
    }
}
