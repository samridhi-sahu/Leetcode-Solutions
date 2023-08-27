// 1313. Decompress Run-Length Encoded List

import java.util.*;

public class Qno1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int len = nums.length;
        for (int i = 0; i < len; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
