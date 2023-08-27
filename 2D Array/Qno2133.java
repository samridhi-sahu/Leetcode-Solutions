<<<<<<< HEAD
// 2133. Check if Every Row and Column Contains All Numbers
// https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/description/

public class Qno2133 {
    public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (map.containsKey(matrix[j][i])) {
                    return false;
                } else {
                    map.put(matrix[j][i], 1);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (map.containsKey(matrix[i][j])) {
                    return false;
                } else {
                    map.put(matrix[i][j], 1);
                }
            }
        }
        return true;
    }
}
=======
// 2133. Check if Every Row and Column Contains All Numbers
// https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/description/

public class Qno2133 {
    public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (map.containsKey(matrix[j][i])) {
                    return false;
                } else {
                    map.put(matrix[j][i], 1);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (map.containsKey(matrix[i][j])) {
                    return false;
                } else {
                    map.put(matrix[i][j], 1);
                }
            }
        }
        return true;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
