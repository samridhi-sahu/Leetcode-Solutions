// 47. Permutations II
// https://leetcode.com/problems/permutations-ii/description/

import java.util.*;

public class PermutationsIIQ47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int n = nums.length;
        solve(0, list, n, nums);
        return list;
    }

    void solve(int i, List<List<Integer>> list, int n, int[] nums) {
        if (i >= n) {
            List<Integer> tempList = new ArrayList<Integer>();
            for (int k = 0; k < n; k++) {
                tempList.add(nums[k]);
            }
            if (!list.contains(tempList))
                list.add(tempList);
            return;
        }
        for (int j = i; j < n; j++) {
            swap(nums, i, j);
            solve(i + 1, list, n, nums);
            swap(nums, i, j); // backtracking
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
