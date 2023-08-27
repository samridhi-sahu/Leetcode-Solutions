<<<<<<< HEAD
// 2535. Difference Between Element Sum and Digit Sum of an Array

class Qno2535 {
    public int differenceOfSum(int[] nums) {
        int x = 0;
        int y = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            x += nums[i];
            if (nums[i] >= 10) {
                while (nums[i] > 0) {
                    y += nums[i] % 10;
                    nums[i] = nums[i] / 10;
                }
            } else {
                y += nums[i];
            }
        }
        ans = x - y;
        if (ans < 0) {
            ans *= -1;
        }
        return ans;
    }
}
=======
// 2535. Difference Between Element Sum and Digit Sum of an Array

class Qno2535 {
    public int differenceOfSum(int[] nums) {
        int x = 0;
        int y = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            x += nums[i];
            if (nums[i] >= 10) {
                while (nums[i] > 0) {
                    y += nums[i] % 10;
                    nums[i] = nums[i] / 10;
                }
            } else {
                y += nums[i];
            }
        }
        ans = x - y;
        if (ans < 0) {
            ans *= -1;
        }
        return ans;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
