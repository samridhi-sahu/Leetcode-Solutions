// 34. Find First and Last Position of Element in Sorted Array
public class Qno34 {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                break;
        }
        if (i == nums.length) {
            arr[0] = -1;
            arr[1] = -1;
            return arr;
        }
        arr[0] = i;
        int j = i;
        for (j = i; j < nums.length && nums[j] == target;) {
            j++;
        }
        arr[1] = j - 1;
        return arr;
    }
}
