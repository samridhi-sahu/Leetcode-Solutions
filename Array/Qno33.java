// 33. Search in Rotated Sorted Array
public class Qno33 {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length;) {
            if (nums[i] == target)
                return i;
            i++;
        }
        return -1;
    }
}
