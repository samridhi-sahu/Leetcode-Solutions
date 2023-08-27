<<<<<<< HEAD
// 154. Find Minimum in Rotated Sorted Array II
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
public class MinEleSortedRotatedArrayQ154 {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums[start] < nums[end])
            return nums[start];
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] > nums[end])
                start = mid + 1;
            else if (nums[mid] < nums[end])
                end = mid;
            else
                end--;
        }
        return nums[end];
    }
}
=======
// 154. Find Minimum in Rotated Sorted Array II
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
public class MinEleSortedRotatedArrayQ154 {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums[start] < nums[end])
            return nums[start];
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] > nums[end])
                start = mid + 1;
            else if (nums[mid] < nums[end])
                end = mid;
            else
                end--;
        }
        return nums[end];
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
