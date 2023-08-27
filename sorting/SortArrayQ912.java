<<<<<<< HEAD
// 912. Sort an Array
// https://leetcode.com/problems/sort-an-array/description/?source=submission-ac
class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    void QuickSort(int[] nums, int start, int end) {
        if (start < end) {
            int k = partition(nums, start, end);
            QuickSort(nums, start, k - 1);
            QuickSort(nums, k + 1, end);
        }
    }

    int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1;
        int j = start;
        while (j < end) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
            j++;
        }
        swap(nums, i + 1, end);
        return i + 1;
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void MergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            MergeSort(nums, low, mid);
            MergeSort(nums, mid + 1, high);
            Merge(nums, low, mid, high);
        }
    }

    void Merge(int[] nums, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - (mid + 1) + 1;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) {
            left[i] = nums[low + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = nums[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = low;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }
        while (i < n1) {
            nums[k++] = left[i++];
        }
        while (j < n2) {
            nums[k++] = right[j++];
        }
    }
=======
// 912. Sort an Array
// https://leetcode.com/problems/sort-an-array/description/?source=submission-ac
class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    void QuickSort(int[] nums, int start, int end) {
        if (start < end) {
            int k = partition(nums, start, end);
            QuickSort(nums, start, k - 1);
            QuickSort(nums, k + 1, end);
        }
    }

    int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1;
        int j = start;
        while (j < end) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
            j++;
        }
        swap(nums, i + 1, end);
        return i + 1;
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void MergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            MergeSort(nums, low, mid);
            MergeSort(nums, mid + 1, high);
            Merge(nums, low, mid, high);
        }
    }

    void Merge(int[] nums, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - (mid + 1) + 1;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) {
            left[i] = nums[low + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = nums[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = low;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }
        while (i < n1) {
            nums[k++] = left[i++];
        }
        while (j < n2) {
            nums[k++] = right[j++];
        }
    }
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
}