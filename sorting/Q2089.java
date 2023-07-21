// 2089. Find Target Indices After Sorting Array
// https://leetcode.com/problems/find-target-indices-after-sorting-array/description/

import java.util.ArrayList;
import java.util.List;

public class Q2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        sort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                list.add(i);
        }
        return list;
    }

    void sort(int[] nums, int start, int end) {
        if (start < end) {
            int k = partition(nums, start, end);
            sort(nums, start, k - 1);
            sort(nums, k + 1, end);
        }
    }

    int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1;
        int j = start;
        while (j < end) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[end];
        nums[end] = temp;
        return i + 1;
    }
}
