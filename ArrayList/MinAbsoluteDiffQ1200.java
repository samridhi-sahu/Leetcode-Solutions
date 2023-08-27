// 1200. Minimum Absolute Difference
// https://leetcode.com/problems/minimum-absolute-difference/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsoluteDiffQ1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        if (arr.length == 2) {
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[0]);
            temp.add(arr[1]);
            ans.add(temp);
            return ans;
        }
        int min = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) < min)
                min = Math.abs(arr[i] - arr[i - 1]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            List<Integer> temp = new ArrayList<>();
            if (Math.abs(arr[i + 1] - arr[i]) == min) {
                temp.add(arr[i]);
                temp.add(arr[i + 1]);
                ans.add(temp);
            }
        }
        return ans;
    }
}
