// 2442. Count Number of Distinct Integers After Reverse Operations
// https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/description/

import java.util.HashSet;

public class Q2442 {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = reverse(nums[i]);
            set.add(nums[i]);
            set.add(temp);
        }
        return set.size();
    }

    int reverse(int x) {
        int n = 0;
        int temp = x;
        while (Math.abs(temp) > 0) {
            temp = temp / 10;
            n++;
        }
        int ans = 0;
        n = n - 1;
        while (n >= 0) {
            ans += (x % 10) * Math.pow(10, n);
            x = x / 10;
            n--;
        }
        return ans;
    }
}
