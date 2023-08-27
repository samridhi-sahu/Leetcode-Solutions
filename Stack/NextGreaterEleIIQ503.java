<<<<<<< HEAD
// 503. Next Greater Element II
// https://leetcode.com/problems/next-greater-element-ii/description/

import java.util.Stack;

public class NextGreaterEleIIQ503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int[] temp = new int[nums.length * 2 - 1];
        for (int i = 0; i < nums.length * 2 - 1; i++) {
            if (i < nums.length)
                temp[i] = nums[i];
            else
                temp[i] = nums[i - nums.length];
        }
        temp = right(temp);
        for (int i = 0; i < nums.length; i++) {
            ans[i] = temp[i];
        }
        return ans;
    }

    int[] right(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.isEmpty())
                ans[i] = -1;
            else if (stack.peek() > nums[i])
                ans[i] = stack.peek();
            else {
                while (stack.size() > 0 && stack.peek() <= nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return ans;
    }
}
=======
// 503. Next Greater Element II
// https://leetcode.com/problems/next-greater-element-ii/description/

import java.util.Stack;

public class NextGreaterEleIIQ503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int[] temp = new int[nums.length * 2 - 1];
        for (int i = 0; i < nums.length * 2 - 1; i++) {
            if (i < nums.length)
                temp[i] = nums[i];
            else
                temp[i] = nums[i - nums.length];
        }
        temp = right(temp);
        for (int i = 0; i < nums.length; i++) {
            ans[i] = temp[i];
        }
        return ans;
    }

    int[] right(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.isEmpty())
                ans[i] = -1;
            else if (stack.peek() > nums[i])
                ans[i] = stack.peek();
            else {
                while (stack.size() > 0 && stack.peek() <= nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return ans;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
