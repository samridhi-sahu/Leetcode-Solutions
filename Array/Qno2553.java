
// 2553. Separate the Digits in an Array
import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (nums[i] > 0) {
                list.add(0, nums[i] % 10);
                nums[i] = nums[i] / 10;
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}