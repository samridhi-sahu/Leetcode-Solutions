<<<<<<< HEAD
// 2319. Check if Matrix Is X-Matrix
// https://leetcode.com/problems/check-if-matrix-is-x-matrix/description/

public class Qno1319 {
    public boolean checkXMatrix(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0, k = n - 1; i < n && k >= 0; i++, k--) {
            if (i != k && mat[i][k] == 0)
                return false;
            for (int j = 0; j < n; j++) {
                if (i == j && mat[i][j] == 0)
                    return false;
                if (i != j && j != k && mat[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
}
=======
// 2319. Check if Matrix Is X-Matrix
// https://leetcode.com/problems/check-if-matrix-is-x-matrix/description/

public class Qno1319 {
    public boolean checkXMatrix(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0, k = n - 1; i < n && k >= 0; i++, k--) {
            if (i != k && mat[i][k] == 0)
                return false;
            for (int j = 0; j < n; j++) {
                if (i == j && mat[i][j] == 0)
                    return false;
                if (i != j && j != k && mat[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
