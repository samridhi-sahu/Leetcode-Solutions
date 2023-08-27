<<<<<<< HEAD
// 81. Search in Rotated Sorted Array II
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class EleRotatedSortedArrQ81 {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (end == 0) {
            if (nums[0] == target)
                return true;
            return false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return true;
            else if (nums[mid] > nums[start]) {
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if (nums[mid] < nums[start]) {
                if (target <= nums[end] && target > nums[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else
                start++;
        }
        return false;
    }
}
=======
// 81. Search in Rotated Sorted Array II
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class EleRotatedSortedArrQ81 {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (end == 0) {
            if (nums[0] == target)
                return true;
            return false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return true;
            else if (nums[mid] > nums[start]) {
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if (nums[mid] < nums[start]) {
                if (target <= nums[end] && target > nums[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else
                start++;
        }
        return false;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
