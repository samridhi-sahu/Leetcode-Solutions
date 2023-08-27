<<<<<<< HEAD
// 84. Largest Rectangle in Histogram
// https://leetcode.com/problems/largest-rectangle-in-histogram/description/

import java.util.Stack;

public class MaxAreaHistogramQ84 {
    public int largestRectangleArea(int[] heights) {
        int[] l = left(heights);
        int[] r = right(heights);
        int max = (r[0] - l[0] - 1) * heights[0];
        for (int i = 1; i < heights.length; i++) {
            if ((r[i] - l[i] - 1) * heights[i] > max) {
                max = (r[i] - l[i] - 1) * heights[i];
            }
        }
        return max;
    }

    int[] left(int[] num) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            if (s.isEmpty())
                ans[i] = -1;
            else if (num[s.peek()] < num[i])
                ans[i] = s.peek();
            else {
                while (!s.isEmpty() && num[s.peek()] >= num[i]) {
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

    int[] right(int[] num) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[num.length];
        for (int i = num.length - 1; i >= 0; i--) {
            if (s.isEmpty())
                ans[i] = num.length;
            else if (num[s.peek()] < num[i])
                ans[i] = s.peek();
            else {
                while (!s.isEmpty() && num[s.peek()] >= num[i]) {
                    s.pop();
                }
                if (s.isEmpty())
                    ans[i] = num.length;
                else
                    ans[i] = s.peek();
            }
            s.push(i);
        }
        return ans;
    }
}
=======
// 84. Largest Rectangle in Histogram
// https://leetcode.com/problems/largest-rectangle-in-histogram/description/

import java.util.Stack;

public class MaxAreaHistogramQ84 {
    public int largestRectangleArea(int[] heights) {
        int[] l = left(heights);
        int[] r = right(heights);
        int max = (r[0] - l[0] - 1) * heights[0];
        for (int i = 1; i < heights.length; i++) {
            if ((r[i] - l[i] - 1) * heights[i] > max) {
                max = (r[i] - l[i] - 1) * heights[i];
            }
        }
        return max;
    }

    int[] left(int[] num) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            if (s.isEmpty())
                ans[i] = -1;
            else if (num[s.peek()] < num[i])
                ans[i] = s.peek();
            else {
                while (!s.isEmpty() && num[s.peek()] >= num[i]) {
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

    int[] right(int[] num) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[num.length];
        for (int i = num.length - 1; i >= 0; i--) {
            if (s.isEmpty())
                ans[i] = num.length;
            else if (num[s.peek()] < num[i])
                ans[i] = s.peek();
            else {
                while (!s.isEmpty() && num[s.peek()] >= num[i]) {
                    s.pop();
                }
                if (s.isEmpty())
                    ans[i] = num.length;
                else
                    ans[i] = s.peek();
            }
            s.push(i);
        }
        return ans;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
