<<<<<<< HEAD
import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0, j = 0, k = 0;
        for (i = 0; i < nums[0].length; i++) {
            for (j = 1; j < nums.length;) {
                for (k = 0; k < nums[j].length; k++) {
                    if (nums[j][k] == nums[0][i])
                        break;
                }
                if (k < nums[j].length)
                    j++;
                else
                    break;
            }
            if (j == nums.length)
                list.add(nums[0][i]);
        }
        Collections.sort(list);
        return list;
    }
=======
import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0, j = 0, k = 0;
        for (i = 0; i < nums[0].length; i++) {
            for (j = 1; j < nums.length;) {
                for (k = 0; k < nums[j].length; k++) {
                    if (nums[j][k] == nums[0][i])
                        break;
                }
                if (k < nums[j].length)
                    j++;
                else
                    break;
            }
            if (j == nums.length)
                list.add(nums[0][i]);
        }
        Collections.sort(list);
        return list;
    }
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
}