<<<<<<< HEAD

// 645. Set Mismatch
import java.util.*;

public class Qno645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        n = n * (n + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            n -= nums[i];
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else
                map.put(nums[i], 1);
        }
        int dup = -1;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 2)
                dup = nums[i];
        }
        int[] arr = { dup, dup + n };
        return arr;
    }
}
=======

// 645. Set Mismatch
import java.util.*;

public class Qno645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        n = n * (n + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            n -= nums[i];
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else
                map.put(nums[i], 1);
        }
        int dup = -1;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 2)
                dup = nums[i];
        }
        int[] arr = { dup, dup + n };
        return arr;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
