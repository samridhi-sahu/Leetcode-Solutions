// 78. Subsets
// https://leetcode.com/problems/subsets/

import java.util.*;

public class SubsetQ78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> anslist = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        solve(nums, temp, 0, anslist);
        return anslist;
    }

    void solve(int[] nums, List<Integer> temp, int i, List<List<Integer>> ans) {
        if (i >= nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        // exclude
        solve(nums, temp, i + 1, ans);
        // include
        temp.add(nums[i]);
        solve(nums, new ArrayList<>(temp), i + 1, ans);
        temp.remove(temp.size() - 1);
    }
}
