
// 448. Find All Numbers Disappeared in an Array
import java.util.*;

public class Qno448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        Arrays.sort(nums);
        for (int i = 1; i <= nums.length; i++) {
            if (Arrays.binarySearch(nums, i) < 0) {
                list.add(i);
            }
        }
        return list;
    }
}
