// 2293. Min Max Game
// https://leetcode.com/problems/min-max-game/description/
public class MinMaxQ2293 {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n > 1) {
            int[] temp = new int[n / 2];
            int flag = 0;
            int i = 0;
            for (int j = 0; j < n; j = j + 2) {
                if (flag == 0) {
                    temp[i++] = Math.min(nums[j], nums[j + 1]);
                    flag = 1;
                } else {
                    temp[i++] = Math.max(nums[j], nums[j + 1]);
                    flag = 0;
                }
            }
            for (int j = 0; j < n / 2; j++) {
                nums[j] = temp[j];
            }
            n = n / 2;
        }
        return nums[0];
    }
}
