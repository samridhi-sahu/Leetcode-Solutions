<<<<<<< HEAD
// 2540. Minimum Common Value
public class Qno2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        return -1;
    }
}
=======
// 2540. Minimum Common Value
public class Qno2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        return -1;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
