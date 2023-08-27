// 217. Contains Duplicate

import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // tc nlogn

        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        // if(nums[i-1]==nums[i]) return true;
        // }
        // return false;

        // tc n + sc n

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > 1)
                return true;
        }
        return false;
    }
}