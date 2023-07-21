// 57. Insert Interval
// https://leetcode.com/problems/insert-interval/description/

import java.util.Arrays;

public class InsertIntervalQ57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] ans = new int[n + 1][2];
        if (n == 0) {
            ans[0][0] = newInterval[0];
            ans[0][1] = newInterval[1];
            return Arrays.copyOfRange(ans, 0, 1);
        }
        int j = 0, i = 0;
        for (i = 0; i < n; i++) {
            if (newInterval[0] <= intervals[i][0]) {
                if (i == 0) {
                    ans[j][0] = newInterval[0];
                    ans[j][1] = newInterval[1];
                    break;
                } else {
                    j--;
                    if (newInterval[0] <= ans[j][1]) {
                        ans[j][1] = Math.max(ans[j][1], newInterval[1]);
                    } else {
                        j++;
                        ans[j][0] = newInterval[0];
                        ans[j][1] = newInterval[1];
                    }
                    break;
                }
            } else {
                ans[j][0] = intervals[i][0];
                ans[j][1] = intervals[i][1];
                j++;
            }
        }
        if (i == n) {
            j--;
            if (newInterval[0] <= ans[j][1]) {
                ans[j][1] = Math.max(ans[j][1], newInterval[1]);
            } else {
                j++;
                ans[j][0] = newInterval[0];
                ans[j][1] = newInterval[1];
            }
        }
        while (i < n) {
            if (intervals[i][0] <= ans[j][1]) {
                ans[j][1] = Math.max(ans[j][1], intervals[i][1]);
            } else {
                j++;
                ans[j][0] = intervals[i][0];
                ans[j][1] = intervals[i][1];
            }
            i++;
        }
        return Arrays.copyOfRange(ans, 0, j + 1);
    }
}
