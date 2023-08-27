// 219. Contains Duplicate II
public class ContainsDuplicateq219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k)
                return true;
            else
                map.put(nums[i], i);
        }
        return false;
    }
}
