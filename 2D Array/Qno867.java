// 867. Transpose Matrix

import java.util.*;

public class Qno867 {
    public static int[][] transpose(int[][] matrix) {
        int[][] t = new int[matrix[0].length][matrix.length];
        try {
            for (int j = 0; j < matrix.length; j++) {
                for (int i = 0; i < matrix[0].length; i++) {
                    t[i][j] = matrix[j][i];
                }
            }
        } catch (Exception e) {
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] ans = transpose(matrix);
        System.out.println(Arrays.toString(ans));
    }
}
