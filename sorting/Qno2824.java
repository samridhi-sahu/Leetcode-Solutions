// 2824. Count Pairs Whose Sum is Less than Target
// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

import java.util.List;

public class Qno2824 {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int n = nums.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target)
                    count++;
            }
        }
        return count;
    }
}
