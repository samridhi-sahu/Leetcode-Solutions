// 1991. Find the Middle Index in Array

public class Qno1991 {
    public int findMiddleIndex(int[] nums) {
        int middleIndex = 0;
        int ans = 0;
        int len = nums.length;
        int sum1 = 0;
        int sum2 = 0;
        for (middleIndex = 0; middleIndex < len; middleIndex++) {
            sum1 = 0;
            for (int i = 0; i < middleIndex; i++) {
                sum1 += nums[i];
            }
            sum2 = 0;
            for (int i = middleIndex + 1; i < len; i++) {
                sum2 += nums[i];
            }
            if (sum1 == sum2) {
                ans = middleIndex;
                break;
            } else
                continue;
        }
        if (sum1 == sum2)
            return ans;
        else
            return -1;
    }
}
