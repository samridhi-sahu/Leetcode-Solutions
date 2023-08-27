<<<<<<< HEAD
// 189. Rotate Array
public class Qno189 {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1 || k == 0 || k == nums.length)
            return;
        int n = nums.length;
        k = k % n;
        k = n - k;
        for (int i = k, j = n - 1; i <= n - 1 && j >= k && i != j && j > i; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = 0, j = k - 1; i <= k - 1 && j >= 0 && i != j && j > i; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = 0, j = n - 1; i <= n - 1 && j >= 0 && i != j && j > i; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
=======
// 189. Rotate Array
public class Qno189 {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1 || k == 0 || k == nums.length)
            return;
        int n = nums.length;
        k = k % n;
        k = n - k;
        for (int i = k, j = n - 1; i <= n - 1 && j >= k && i != j && j > i; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = 0, j = k - 1; i <= k - 1 && j >= 0 && i != j && j > i; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = 0, j = n - 1; i <= n - 1 && j >= 0 && i != j && j > i; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
