<<<<<<< HEAD
//2148. Count Elements With Strictly Smaller and Greater Elements
// https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/description/

public class Qno2148 {
    public int countElements(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] != min)
                count++;
        }
        return count;
    }
}
=======
//2148. Count Elements With Strictly Smaller and Greater Elements
// https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/description/

public class Qno2148 {
    public int countElements(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] != min)
                count++;
        }
        return count;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
