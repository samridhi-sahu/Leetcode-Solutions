// 1995. Count Special Quadruplets
public class Qno1995 {
    public int countQuadruplets(int[] nums) {
        int l = nums.length;
        int count = 0;
        for (int i = 0; i < l - 3; i++) {
            for (int j = i + 1; j < l - 2; j++) {
                for (int k = j + 1; k < l - 1; k++) {
                    for (int m = k + 1; m < l; m++) {
                        if (i < j && j < k && k < m && nums[i] + nums[j] + nums[k] == nums[m]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
