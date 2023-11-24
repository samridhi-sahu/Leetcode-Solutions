// 2160. Minimum Sum of Four Digit Number After Splitting Digits
// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/ 

import java.util.Arrays;

public class Qno2160 {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        for (int i = 3; i >= 0; i--) {
            arr[i] = num % 10;
            num = num / 10;
        }
        Arrays.sort(arr);
        return (arr[0] * 10 + arr[2]) + (arr[1] * 10 + arr[3]);
    }
}
