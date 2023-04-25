// 268. Missing Number
public class Qno268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        n = n * (n + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            n -= nums[i];
        }
        return n;
    }
}
