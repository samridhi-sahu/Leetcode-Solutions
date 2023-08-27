
// 1464. Maximum Product of Two Elements in an Array
import java.util.*;

public class Qno1464 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
