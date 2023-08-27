<<<<<<< HEAD
// 2529. Maximum Count of Positive Integer and Negative Integer
public class Qno2529 {
    public int maximumCount(int[] nums) {
        int l = 0;
        int pos = 0, neg = 0;
        while (l < nums.length) {
            if (nums[l] < 0) {
                neg++;
            }
            if (nums[l] > 0) {
                pos++;
            }
            l++;
        }
        return Math.max(pos, neg);
    }
}
=======
// 2529. Maximum Count of Positive Integer and Negative Integer
public class Qno2529 {
    public int maximumCount(int[] nums) {
        int l = 0;
        int pos = 0, neg = 0;
        while (l < nums.length) {
            if (nums[l] < 0) {
                neg++;
            }
            if (nums[l] > 0) {
                pos++;
            }
            l++;
        }
        return Math.max(pos, neg);
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
