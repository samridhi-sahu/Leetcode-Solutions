<<<<<<< HEAD
// 1979. Find Greatest Common Divisor of Array
// https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/
public class gcdArrayQ1979 {
    public int findGCD(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        int min = max;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        int i = min;
        while (i > 0) {
            if (max % i == 0 && min % i == 0)
                return i;
            i--;
        }
        return 0;
    }
}
=======
// 1979. Find Greatest Common Divisor of Array
// https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/
public class gcdArrayQ1979 {
    public int findGCD(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        int min = max;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        int i = min;
        while (i > 0) {
            if (max % i == 0 && min % i == 0)
                return i;
            i--;
        }
        return 0;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
