// 2549. Count Distinct Numbers on Board
// https://leetcode.com/problems/count-distinct-numbers-on-board/description/

import java.util.HashSet;

public class Qno2549 {
    public int distinctIntegers(int n) {
        // time complexity O(N) and space complexity will also be O(N)
        // HashSet<Integer> board = new HashSet<>();
        // board.add(n);
        // add(n, board);
        // return board.size();

        // time complexity O(1) and space complexity will also be O(1)
        if (n == 1)
            return 1;
        return n - 1;
    }

    void add(int n, HashSet<Integer> board) {
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                board.add(i);
                add(i, board);
            }
        }
    }
}
