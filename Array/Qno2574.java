// 2574. Left and Right Sum Differences
public class Qno2574 {
    public int[] leftRigthDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int[] temp = new int[nums.length];
        int sum;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum = 0;
            for (int j = i - 1; j >= 0; j--) {
                sum += nums[j];
            }
            temp[i] = sum;
        }
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
            }
            answer[i] = temp[i] - sum;
            if (answer[i] < 0) {
                answer[i] *= -1;
            }
        }
        return answer;
    }
}
