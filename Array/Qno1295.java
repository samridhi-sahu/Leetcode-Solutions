// 1295. Find Numbers with Even Number of Digits

import java.util.*;

public class Qno1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        int n;
        int digits;
        for (int i = 0; i < nums.length; i++) {
            digits = 0;
            n = nums[i];
            for (int j = n; n > 0; j--) {
                n = n / 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
}
