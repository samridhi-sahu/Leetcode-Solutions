// 496. Next Greater Element I
// https://leetcode.com/problems/next-greater-element-i/description/

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterEleIQ496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            if (stack.isEmpty())
                map.put(nums2[i], -1);
            else if (stack.peek() > nums2[i])
                map.put(nums2[i], stack.peek());
            else {
                while (stack.size() > 0 && stack.peek() <= nums2[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    map.put(nums2[i], -1);
                else
                    map.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
