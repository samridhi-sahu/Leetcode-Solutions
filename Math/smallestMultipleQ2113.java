// 2413. Smallest Even Multiple
// https://leetcode.com/problems/smallest-even-multiple/description/
public class smallestMultipleQ2113 {
    public int smallestEvenMultiple(int n) {
        for (int i = 2; i <= n * 2; i = i + 2) {
            if (i % n == 0 && i % 2 == 0)
                return i;
        }
        return 0;
    }
}
