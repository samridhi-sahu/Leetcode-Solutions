
// 1380. Lucky Numbers in a Matrix

import java.util.*;

public class Qno1380 {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int x = 0;
        try {
            for (int i = 0; i < matrix.length; i++) {
                int num1 = matrix[i][0];
                for (int j = 0; j < matrix[0].length; j++) {
                    if (num1 >= matrix[i][j]) {
                        num1 = matrix[i][j];
                        x = j;
                    }
                }
                int num2 = matrix[i][x];
                for (int k = 0; k < matrix.length; k++) {
                    if (num2 <= matrix[k][x]) {
                        num2 = matrix[k][x];
                    }
                }
                if (num1 == num2) {
                    ans.add(0, num2);
                }
            }
        } catch (Exception e) {
        }
        return ans;
    }
}
