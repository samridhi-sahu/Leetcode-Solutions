<<<<<<< HEAD
// 2475. Number of Unequal Triplets in Array
public class Qno2475 {
    public int unequalTriplets(int[] nums) {
        int l = nums.length;
        int count = 0;
        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {
                    if (i < j && j < k && nums[i] != nums[j] && nums[j] != nums[k] && nums[k] != nums[i]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
=======
// 2475. Number of Unequal Triplets in Array
public class Qno2475 {
    public int unequalTriplets(int[] nums) {
        int l = nums.length;
        int count = 0;
        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {
                    if (i < j && j < k && nums[i] != nums[j] && nums[j] != nums[k] && nums[k] != nums[i]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
