<<<<<<< HEAD
// 1475. Final Prices With a Special Discount in a Shop
// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/

import java.util.Stack;

public class Q1475 {
    public int[] finalPrices(int[] nums) {
        int[] answer = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.isEmpty())
                answer[i] = nums[i];
            else if (stack.peek() <= nums[i])
                answer[i] = nums[i] - stack.peek();
            else {
                while (!stack.isEmpty() && stack.peek() > nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    answer[i] = nums[i];
                else
                    answer[i] = nums[i] - stack.peek();
            }
            stack.push(nums[i]);
        }
        return answer;
    }
}
=======
// 1475. Final Prices With a Special Discount in a Shop
// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/

import java.util.Stack;

public class Q1475 {
    public int[] finalPrices(int[] nums) {
        int[] answer = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.isEmpty())
                answer[i] = nums[i];
            else if (stack.peek() <= nums[i])
                answer[i] = nums[i] - stack.peek();
            else {
                while (!stack.isEmpty() && stack.peek() > nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    answer[i] = nums[i];
                else
                    answer[i] = nums[i] - stack.peek();
            }
            stack.push(nums[i]);
        }
        return answer;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
