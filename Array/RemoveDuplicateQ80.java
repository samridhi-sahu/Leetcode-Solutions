<<<<<<< HEAD
// 80. Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicateQ80 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int flag = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1])
                flag = 1;
            else {
                nums[k++] = nums[i];
                if (flag == 1) {
                    nums[k++] = nums[i];
                    flag = 0;
                }
            }
            i++;
        }
        nums[k++] = nums[i];
        if (flag == 1)
            nums[k++] = nums[i];
        return k;
    }
}
=======
// 80. Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicateQ80 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int flag = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1])
                flag = 1;
            else {
                nums[k++] = nums[i];
                if (flag == 1) {
                    nums[k++] = nums[i];
                    flag = 0;
                }
            }
            i++;
        }
        nums[k++] = nums[i];
        if (flag == 1)
            nums[k++] = nums[i];
        return k;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
