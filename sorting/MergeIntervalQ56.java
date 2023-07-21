// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/description/

import java.util.Arrays;

public class MergeIntervalQ56 {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 1)
            return intervals;
        QuickSort(0, n - 1, intervals);
        int[][] ans = new int[n][2];
        int j = 0;
        ans[j][0] = intervals[0][0];
        ans[j][1] = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= ans[j][1]) {
                ans[j][1] = Math.max(ans[j][1], intervals[i][1]);
            } else {
                j++;
                ans[j][0] = intervals[i][0];
                ans[j][1] = intervals[i][1];
            }
        }
        return Arrays.copyOfRange(ans, 0, j + 1);
    }

    void QuickSort(int start, int end, int[][] intervals) {
        if (start < end) {
            int k = partition(intervals, start, end);
            QuickSort(start, k - 1, intervals);
            QuickSort(k + 1, end, intervals);
        }
    }

    int partition(int[][] intervals, int start, int end) {
        int pivot = intervals[end][0];
        int i = start - 1;
        int j = start;
        while (j < end) {
            if (intervals[j][0] <= pivot) {
                i++;
                swap(intervals, i, j, 0);
                swap(intervals, i, j, 1);
            }
            j++;
        }
        swap(intervals, i + 1, end, 0);
        swap(intervals, i + 1, end, 1);
        return i + 1;
    }

    void swap(int[][] intervals, int i, int j, int k) {
        int temp = intervals[i][k];
        intervals[i][k] = intervals[j][k];
        intervals[j][k] = temp;
    }
}
