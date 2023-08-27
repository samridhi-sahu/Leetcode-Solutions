<<<<<<< HEAD

// 2215. Find the Difference of Two Arrays
import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> temp1 = new ArrayList<Integer>();
        int i = 0, j = 0;
        for (i = 0; i < nums1.length; i++) {
            for (j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    break;
                }
            }
            if (j == nums2.length && !temp1.contains(nums1[i])) {
                temp1.add(nums1[i]);
            }
        }
        answer.add(temp1);
        List<Integer> temp2 = new ArrayList<Integer>();
        for (i = 0; i < nums2.length; i++) {
            for (j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    break;
                }
            }
            if (j == nums1.length && !temp2.contains(nums2[i])) {
                temp2.add(nums2[i]);
            }
        }
        answer.add(temp2);
        return answer;
    }
=======

// 2215. Find the Difference of Two Arrays
import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> temp1 = new ArrayList<Integer>();
        int i = 0, j = 0;
        for (i = 0; i < nums1.length; i++) {
            for (j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    break;
                }
            }
            if (j == nums2.length && !temp1.contains(nums1[i])) {
                temp1.add(nums1[i]);
            }
        }
        answer.add(temp1);
        List<Integer> temp2 = new ArrayList<Integer>();
        for (i = 0; i < nums2.length; i++) {
            for (j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    break;
                }
            }
            if (j == nums1.length && !temp2.contains(nums2[i])) {
                temp2.add(nums2[i]);
            }
        }
        answer.add(temp2);
        return answer;
    }
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
}