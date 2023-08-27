// 1252. Cells with Odd Values in a Matrix
public class Qno1252 {
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = 0;
            }
        }
        int size = indices.length;
        for (int i = 0; i < size; i++) {
            int row = indices[i][0];
            if (row < m) {
                for (int j = 0; j < n; j++) {
                    mat[row][j]++;
                }
            }
            int col = indices[i][1];
            if (col < n) {
                for (int j = 0; j < m; j++) {
                    mat[j][col]++;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] % 2 != 0)
                    count++;
            }
        }
        return count;
    }
}
