// 1051. Height Checker
// https://leetcode.com/problems/height-checker/description/
public class heigthCheckerQ1051 {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = heights[i];
        }
        for (int i = 0; i < expected.length - 1; i++) {
            for (int j = i + 1; j < expected.length; j++) {
                if (expected[j] < expected[i]) {
                    int temp = expected[i];
                    expected[i] = expected[j];
                    expected[j] = temp;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != heights[i])
                count++;
        }
        return count;
    }
}
