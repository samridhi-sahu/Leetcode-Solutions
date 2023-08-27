<<<<<<< HEAD
// 75. Sort Colors
// https://leetcode.com/problems/sort-colors/description/
public class SortColorQ75 {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        QuickSort(start, end, nums);
    }

    void QuickSort(int start, int end, int[] nums) {
        if (start < end) {
            int k = partition(start, end, nums);
            QuickSort(start, k - 1, nums);
            QuickSort(k + 1, end, nums);
        }
    }

    int partition(int start, int end, int[] nums) {
        int pivot = nums[end];
        int i = start - 1;
        int j = start;
        while (j < end) {
            if (nums[j] < pivot) {
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
=======
// 75. Sort Colors
// https://leetcode.com/problems/sort-colors/description/
public class SortColorQ75 {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        QuickSort(start, end, nums);
    }

    void QuickSort(int start, int end, int[] nums) {
        if (start < end) {
            int k = partition(start, end, nums);
            QuickSort(start, k - 1, nums);
            QuickSort(k + 1, end, nums);
        }
    }

    int partition(int start, int end, int[] nums) {
        int pivot = nums[end];
        int i = start - 1;
        int j = start;
        while (j < end) {
            if (nums[j] < pivot) {
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
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
