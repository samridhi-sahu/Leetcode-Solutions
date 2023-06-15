// 1630. Arithmetic Subarrays
//https://leetcode.com/problems/arithmetic-subarrays/description/
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
