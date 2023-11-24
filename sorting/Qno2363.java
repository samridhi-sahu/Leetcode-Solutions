// 2363. Merge Similar Items
// https://leetcode.com/problems/merge-similar-items/description/

import java.util.ArrayList;
import java.util.List;

public class Qno2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        sort(items1);
        sort(items2);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int i = 0, j = 0;
        while (i < items1.length && j < items2.length) {
            List<Integer> row = new ArrayList<>();
            if (items1[i][0] == items2[j][0]) {
                row.add(items1[i][0]);
                row.add(items1[i][1] + items2[j][1]);
                i++;
                j++;
            } else {
                if (items1[i][0] < items2[j][0]) {
                    row.add(items1[i][0]);
                    row.add(items1[i][1]);
                    i++;
                } else {
                    row.add(items2[j][0]);
                    row.add(items2[j][1]);
                    j++;
                }
            }
            ans.add(row);
        }
        while (i < items1.length) {
            List<Integer> row = new ArrayList<>();
            row.add(items1[i][0]);
            row.add(items1[i][1]);
            ans.add(row);
            i++;
        }
        while (j < items2.length) {
            List<Integer> row = new ArrayList<>();
            row.add(items2[j][0]);
            row.add(items2[j][1]);
            ans.add(row);
            j++;
        }
        return ans;
    }

    void sort(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][0] > arr[j][0]) {
                    int temp1 = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp1;
                    int temp2 = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp2;
                }
            }
        }
    }
}
