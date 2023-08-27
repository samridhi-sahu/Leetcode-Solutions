<<<<<<< HEAD
// 88. Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        if (i < 0) {
            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }
        }
        if (j < 0) {
            while (i >= 0) {
                nums1[k--] = nums1[i--];
            }
        }
    }
=======
// 88. Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        if (i < 0) {
            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }
        }
        if (j < 0) {
            while (i >= 0) {
                nums1[k--] = nums1[i--];
            }
        }
    }
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
}