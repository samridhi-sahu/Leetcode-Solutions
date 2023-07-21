// 239. Sliding Window Maximum
// https://leetcode.com/problems/sliding-window-maximum/description/

import java.util.ArrayList;
import java.util.List;

public class slidingWindowMaxQ239 {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        List<Integer> record = new ArrayList<>();
        int[] ans = new int[n - k + 1];
        int i = 0, j = 0, l = 0;
        while (j < n) {
            while (record.size() > 0 && record.get(record.size() - 1) < arr[j]) {
                record.remove(record.size() - 1);
            }
            record.add(arr[j]);
            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                ans[l++] = record.get(0);
                if (record.get(0) == arr[i]) {
                    record.remove(0);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
