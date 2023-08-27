// 2367. Number of Arithmetic Triplets
class Qno2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int l = nums.length;
        int count = 0;
        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {
                    if (i < j && j < k && nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}