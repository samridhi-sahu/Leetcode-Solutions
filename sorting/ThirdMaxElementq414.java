//414. Third Maximum Number
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int pivot = nums.length - 1;
        int i = pivot - 1;
        int count = 0;
        while (i >= 0 && count < 2) {
            if (nums[i] != nums[pivot]) {
                pivot = i;
                count++;
            }
            i--;
        }
        if (count != 2)
            return nums[nums.length - 1];
        return nums[pivot];
    }
}