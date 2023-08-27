<<<<<<< HEAD
// 1630. Arithmetic Subarrays
//https://leetcode.com/problems/arithmetic-subarrays/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class APsubArrayQ1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> boollist = new ArrayList<Boolean>();
        for (int i = 0; i < l.length; i++) {
            int[] subarray = new int[r[i] - l[i] + 1];
            int j = 0, k = l[i];
            while (k <= r[i]) {
                subarray[j++] = nums[k++];
            }
            Arrays.sort(subarray);
            int flag = subarray[1] - subarray[0];
            int x;
            for (x = 2; x < subarray.length; x++) {
                if (subarray[x] - subarray[x - 1] != flag) {
                    boollist.add(false);
                    break;
                }
            }
            if (x == subarray.length)
                boollist.add(true);
        }
        return boollist;
    }
}
=======
// 1630. Arithmetic Subarrays
//https://leetcode.com/problems/arithmetic-subarrays/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class APsubArrayQ1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> boollist = new ArrayList<Boolean>();
        for (int i = 0; i < l.length; i++) {
            int[] subarray = new int[r[i] - l[i] + 1];
            int j = 0, k = l[i];
            while (k <= r[i]) {
                subarray[j++] = nums[k++];
            }
            Arrays.sort(subarray);
            int flag = subarray[1] - subarray[0];
            int x;
            for (x = 2; x < subarray.length; x++) {
                if (subarray[x] - subarray[x - 1] != flag) {
                    boollist.add(false);
                    break;
                }
            }
            if (x == subarray.length)
                boollist.add(true);
        }
        return boollist;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
