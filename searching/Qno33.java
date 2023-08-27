<<<<<<< HEAD
// 33. Search in Rotated Sorted Array
public class Qno33 {
    public int search(int[] nums, int target) {
        // time complexity is O(N)
        // for(int i=0;i<nums.length;){
        // if(nums[i]==target) return i;
        // i++;
        // }
        // return -1;

        // time complexity is O(log n)
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }
        int ans = binarySearch(nums, target, 0, end - 1);
        if (ans != -1)
            return ans;
        ans = binarySearch(nums, target, end, nums.length - 1);
        return ans;
    }

    int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
=======
// 33. Search in Rotated Sorted Array
public class Qno33 {
    public int search(int[] nums, int target) {
        // time complexity is O(N)
        // for(int i=0;i<nums.length;){
        // if(nums[i]==target) return i;
        // i++;
        // }
        // return -1;

        // time complexity is O(log n)
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }
        int ans = binarySearch(nums, target, 0, end - 1);
        if (ans != -1)
            return ans;
        ans = binarySearch(nums, target, end, nums.length - 1);
        return ans;
    }

    int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
