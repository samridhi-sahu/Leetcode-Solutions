// 1. Two Sum

import java.util.*;

public class Qno1 {
    public static int[] twoSum(int[] nums, int target) {
        int sum;
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target && i != j) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = twoSum(nums, target);
    }
}
