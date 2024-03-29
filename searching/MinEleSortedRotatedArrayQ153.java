<<<<<<< HEAD
// 153. Find Minimum in Rotated Sorted Array
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class MinEleSortedRotatedArrayQ153 {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }
        return nums[end];
    }
}
=======
// 153. Find Minimum in Rotated Sorted Array
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class MinEleSortedRotatedArrayQ153 {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }
        return nums[end];
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
