// 724. Find Pivot Index

public class Qno724 {
    public int pivotIndex(int[] nums) {
        int pivotIndex = 0;
        int ans = 0;
        int len = nums.length;
        int sum1 = 0;
        int sum2 = 0;
        for (pivotIndex = 0; pivotIndex < len; pivotIndex++) {
            sum1 = 0;
            for (int i = 0; i < pivotIndex; i++) {
                sum1 += nums[i];
            }
            sum2 = 0;
            for (int i = pivotIndex + 1; i < len; i++) {
                sum2 += nums[i];
            }
            if (sum1 == sum2) {
                ans = pivotIndex;
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
