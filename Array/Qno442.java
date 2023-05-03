// 442. Find All Duplicates in an Array
public class Qno442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums.length)
                count++;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (index == nums.length) {
            } else if (nums[index] < 0) {
                list.add(index);
            } else
                nums[index] = -nums[index];
        }
        if (count > 1)
            list.add(nums.length);
        return list;
    }
}
