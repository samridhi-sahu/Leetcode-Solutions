<<<<<<< HEAD

// 73. Set Matrix Zeroes
import java.util.*;

public class Qno73 {
    public void setZeroes(int[][] matrix) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        for (int k = 0; k < list.size() - 1; k = k + 2) {
            int i = list.get(k);
            int j = list.get(k + 1);
            for (int n = 0; n < matrix[0].length; n++) {
                matrix[i][n] = 0;
            }
            for (int m = 0; m < matrix.length; m++) {
                matrix[m][j] = 0;
            }
        }
    }
}
=======

// 73. Set Matrix Zeroes
import java.util.*;

public class Qno73 {
    public void setZeroes(int[][] matrix) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        for (int k = 0; k < list.size() - 1; k = k + 2) {
            int i = list.get(k);
            int j = list.get(k + 1);
            for (int n = 0; n < matrix[0].length; n++) {
                matrix[i][n] = 0;
            }
            for (int m = 0; m < matrix.length; m++) {
                matrix[m][j] = 0;
            }
        }
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
