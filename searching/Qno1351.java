<<<<<<< HEAD
// 1351. Count Negative Numbers in a Sorted Matrix

public class Qno1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (grid[i][j] < 0)
                    count++;
                else
                    break;
            }
        }
        return count;
    }
}
=======
// 1351. Count Negative Numbers in a Sorted Matrix

public class Qno1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (grid[i][j] < 0)
                    count++;
                else
                    break;
            }
        }
        return count;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
