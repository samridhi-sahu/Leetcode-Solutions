// 2455. Average Value of Even Numbers That Are Divisible by Three
// https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/description/
public class Qno2455 {
    class Solution {
        public int averageValue(int[] nums) {
            int avg = 0, n = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                    avg += nums[i];
                    n++;
                }
            }
            if (n == 0)
                return 0;
            return avg / n;
        }
    }
}
