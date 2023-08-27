<<<<<<< HEAD

// 1464. Maximum Product of Two Elements in an Array
import java.util.*;

public class Qno1464 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
=======

// 1464. Maximum Product of Two Elements in an Array
import java.util.*;

public class Qno1464 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
