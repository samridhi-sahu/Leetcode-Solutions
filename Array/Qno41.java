<<<<<<< HEAD

// 41. First Missing Positive
import java.util.*;

public class Qno41 {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        long max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (max <= nums[i])
                max = nums[i];
        }
        for (int i = 1; i <= max + 1; i++) {
            if (!set.contains(i))
                return i;
        }
        return 1;
    }
}
=======

// 41. First Missing Positive
import java.util.*;

public class Qno41 {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        long max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (max <= nums[i])
                max = nums[i];
        }
        for (int i = 1; i <= max + 1; i++) {
            if (!set.contains(i))
                return i;
        }
        return 1;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
