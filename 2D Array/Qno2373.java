// 2373. Largest Local Values in a Matrix
public class Qno2373 {
    public int[][] largestLocal(int[][] grid) {
        int s, m, n, i, j, k, l, max;
        s = grid.length;
        int[][] arr = new int[s - 2][s - 2];
        for (i = 0; i < s - 2; i++) {
            for (j = 0; j < s - 2; j++) {
                max = grid[i][j];
                m = i + 3;
                n = j + 3;
                for (k = i; k < m; k++) {
                    for (l = j; l < n; l++) {
                        if (max < grid[k][l])
                            max = grid[k][l];
                    }
                }
                arr[i][j] = max;
            }
        }
        return arr;
    }
}
