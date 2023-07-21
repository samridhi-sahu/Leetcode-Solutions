// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class Qno34 {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        // time complexity is O(N)
        // int i = 0;
        // for(i=0;i<nums.length;i++){
        // if(nums[i]==target) break;
        // }
        // if(i==nums.length){
        // arr[0] = -1;
        // arr[1] = -1;
        // return arr;
        // }
        // arr[0] = i;
        // int j=i;
        // for( j=i;j<nums.length&&nums[j]==target;){
        // j++;
        // }
        // arr[1] = j-1;
        // return arr;

        // time complexity is O(logn)
        int start = 0, end = nums.length - 1, res = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] == target) {
                res = mid;
                end = mid - 1;
            } else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        arr[0] = res;
        start = 0;
        end = nums.length - 1;
        res = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] == target) {
                res = mid;
                start = mid + 1;
            } else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        arr[1] = res;
        return arr;
    }
}
