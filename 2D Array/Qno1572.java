
// 1572. Matrix Diagonal Sum
import java.util.*;

public class Qno1572 {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += mat[i][j];
                }
            }
        }
        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            if (i != j) {
                sum += mat[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int ans = diagonalSum(mat);
        System.out.println(ans);
    }
}
