<<<<<<< HEAD

// 169. Majority Element
import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else
                map.put(nums[i], 1);
        }
        int max = 0, res = 0;
        for (Entry<Integer, Integer> val : map.entrySet()) {
            if (max < val.getValue()) {
                res = val.getKey();
                max = val.getValue();
            }
        }
        return res;
    }

}
=======

// 169. Majority Element
import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else
                map.put(nums[i], 1);
        }
        int max = 0, res = 0;
        for (Entry<Integer, Integer> val : map.entrySet()) {
            if (max < val.getValue()) {
                res = val.getKey();
                max = val.getValue();
            }
        }
        return res;
    }

}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
