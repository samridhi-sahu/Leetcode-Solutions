// 85. Maximal Rectangle
// https://leetcode.com/problems/maximal-rectangle/description/

import java.util.Stack;

public class MaximalRectangleQ85 {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = matrix[0][i] - '0';
        }
        int max = mah(nums);
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '0')
                    nums[j] = 0;
                else
                    nums[j] += 1;
            }
            max = Math.max(max, mah(nums));
        }
        return max;
    }

    int mah(int[] nums) {
        int[] r = right(nums);
        int[] l = left(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = (r[i] - l[i] - 1) * nums[i];
            max = Math.max(max, temp);
        }
        return max;
    }

    int[] right(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (s.isEmpty())
                ans[i] = nums.length;
            else if (nums[s.peek()] < nums[i])
                ans[i] = s.peek();
            else {
                while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
                    s.pop();
                }
                if (s.isEmpty())
                    ans[i] = nums.length;
                else
                    ans[i] = s.peek();
            }
            s.push(i);
        }
        return ans;
    }

    int[] left(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (s.isEmpty())
                ans[i] = -1;
            else if (nums[s.peek()] < nums[i])
                ans[i] = s.peek();
            else {
                while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
                    s.pop();
                }
                if (s.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = s.peek();
            }
            s.push(i);
        }
        return ans;
    }
}
