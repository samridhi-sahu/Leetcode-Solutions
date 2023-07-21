// 1636. Sort Array by Increasing Frequency
// https://leetcode.com/problems/sort-array-by-increasing-frequency/description/

import java.util.HashMap;

public class sortByFreqQ1236 {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else
                map.put(nums[i], 1);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (map.get(nums[i]) > map.get(nums[j])) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                } else if (map.get(nums[i]) == map.get(nums[j])) {
                    if (nums[i] < nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }
}
