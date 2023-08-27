// 2006. Count Number of Pairs With Absolute Difference K
public class Qno2006 {
    public int countKDifference(int[] nums, int k) {
        int l = nums.length;
        int x;
        int count = 0;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                x = nums[i] - nums[j];
                if (x < 0) {
                    x *= -1;
                }
                if (i < j && x == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
