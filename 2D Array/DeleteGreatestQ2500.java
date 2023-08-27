// 2500. Delete Greatest Value in Each Row
// https://leetcode.com/problems/delete-greatest-value-in-each-row/description/
public class DeleteGreatestQ2500 {
    public int deleteGreatestValue(int[][] grid) {
        int ans = 0;
        int size = grid[0].length;
        while (size > 0) {
            int[] temp = new int[grid.length];
            for (int i = 0; i < grid.length; i++) {
                int max = grid[i][0];
                int index = 0;
                for (int j = 1; j < grid[i].length; j++) {
                    if (grid[i][j] != -1 && max < grid[i][j]) {
                        max = grid[i][j];
                        index = j;
                    }
                }
                grid[i][index] = -1;
                temp[i] = max;
            }
            int x = temp[0];
            for (int i = 1; i < temp.length; i++) {
                if (x < temp[i])
                    x = temp[i];
            }
            ans += x;
            size--;
        }
        return ans;
    }
}
