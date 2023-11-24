
// 1337. The K Weakest Rows in a Matrix
// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/description/
import java.util.Arrays;

public class Qno1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ones = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int j = 0;
            while (j < mat[0].length) {
                if (mat[i][j] == 0)
                    break;
                else
                    j++;
            }
            ones[i] = j;
        }
        int[] arr = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (ones[i] > ones[j]) {
                    int t = ones[i];
                    ones[i] = ones[j];
                    ones[j] = t;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (ones[i] == ones[j] && arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Arrays.copyOfRange(arr, 0, k);
    }
}
