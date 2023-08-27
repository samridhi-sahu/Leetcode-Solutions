<<<<<<< HEAD
// 215. Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/description/s

import java.util.PriorityQueue;

public class kthLargestElementq215 {
    public int findKthLargest(int[] nums, int k) {
        // tc nlogn
        // Arrays.sort(nums);
        // return nums[nums.length-k];

        // tc n
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (minheap.size() == k) {
                if (minheap.peek() < nums[i]) {
                    minheap.poll();
                    minheap.add(nums[i]);
                }
            } else {
                minheap.add(nums[i]);
            }
        }
        return minheap.peek();
    }
}
=======
// 215. Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/description/s

import java.util.PriorityQueue;

public class kthLargestElementq215 {
    public int findKthLargest(int[] nums, int k) {
        // tc nlogn
        // Arrays.sort(nums);
        // return nums[nums.length-k];

        // tc n
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (minheap.size() == k) {
                if (minheap.peek() < nums[i]) {
                    minheap.poll();
                    minheap.add(nums[i]);
                }
            } else {
                minheap.add(nums[i]);
            }
        }
        return minheap.peek();
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
