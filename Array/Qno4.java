<<<<<<< HEAD
// 4. Median of Two Sorted Arrays
public class Qno4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] arr = new int[nums1.length + nums2.length];
        for (i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                arr[k] = nums2[j];
                j++;
            } else {
                arr[k] = nums1[i];
                arr[++k] = nums2[j];
                i++;
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        double ans = 0;
        int index = arr.length / 2;
        if (arr.length % 2 == 0) {
            ans = ((double) arr[index - 1] + (double) arr[index]) / 2;
        } else {
            ans = arr[index];
        }
        return ans;
    }
}
=======
// 4. Median of Two Sorted Arrays
public class Qno4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] arr = new int[nums1.length + nums2.length];
        for (i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                arr[k] = nums2[j];
                j++;
            } else {
                arr[k] = nums1[i];
                arr[++k] = nums2[j];
                i++;
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        double ans = 0;
        int index = arr.length / 2;
        if (arr.length % 2 == 0) {
            ans = ((double) arr[index - 1] + (double) arr[index]) / 2;
        } else {
            ans = arr[index];
        }
        return ans;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
