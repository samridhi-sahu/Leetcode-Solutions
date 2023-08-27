<<<<<<< HEAD
// 2352. Equal Row and Column Pairs
// https://leetcode.com/problems/equal-row-and-column-pairs/description/
class EqualRowAndColQno2352 {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            int[] temp1 = new int[n];
            for (int j = 0; j < n; j++) {
                temp1[j] = grid[i][j];
            }
            for (int l = 0; l < n; l++) {
                int[] temp2 = new int[n];
                for (int j = 0; j < n; j++) {
                    temp2[j] = grid[j][l];
                }
                int k = 0;
                while (k < n) {
                    if (temp1[k] != temp2[k])
                        break;
                    k++;
                }
                if (k == n)
                    count++;
            }
        }
        return count;
    }
=======
// 2352. Equal Row and Column Pairs
// https://leetcode.com/problems/equal-row-and-column-pairs/description/
class EqualRowAndColQno2352 {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            int[] temp1 = new int[n];
            for (int j = 0; j < n; j++) {
                temp1[j] = grid[i][j];
            }
            for (int l = 0; l < n; l++) {
                int[] temp2 = new int[n];
                for (int j = 0; j < n; j++) {
                    temp2[j] = grid[j][l];
                }
                int k = 0;
                while (k < n) {
                    if (temp1[k] != temp2[k])
                        break;
                    k++;
                }
                if (k == n)
                    count++;
            }
        }
        return count;
    }
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
}