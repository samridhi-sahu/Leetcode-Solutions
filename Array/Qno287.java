<<<<<<< HEAD
// 287. Find the Duplicate Number

public class Qno287 {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[nums[i] % n] = nums[nums[i] % n] + n;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] >= n * 2)
                return i;
        }
        return 0;
    }
}
=======
// 287. Find the Duplicate Number

public class Qno287 {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[nums[i] % n] = nums[nums[i] % n] + n;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] >= n * 2)
                return i;
        }
        return 0;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
