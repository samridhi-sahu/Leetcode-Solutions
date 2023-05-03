// 2154. Keep Multiplying Found Values by Two
public class Qno2154 {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        while (set.contains(original)) {
            original = original * 2;
        }
        return original;
    }
}
