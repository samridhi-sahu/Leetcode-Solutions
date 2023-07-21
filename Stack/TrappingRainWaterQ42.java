// 42. Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water/description/
public class TrappingRainWaterQ42 {
    public int trap(int[] height) {
        int[] maxL = new int[height.length];
        int[] maxR = new int[height.length];
        maxL[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            maxL[i] = Math.max(maxL[i - 1], height[i]);
        }
        maxR[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            maxR[i] = Math.max(maxR[i + 1], height[i]);
        }
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(maxL[i], maxR[i]) - height[i];
        }
        return sum;
    }
}
