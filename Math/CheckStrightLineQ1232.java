<<<<<<< HEAD
// 1232. Check If It Is a Straight Line
// https://leetcode.com/problems/check-if-it-is-a-straight-line/description/
public class CheckStrightLineQ1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        // m = y2-y1/x2-x1
        int deltaY = (coordinates[1][1] - coordinates[0][1]);
        int deltaX = (coordinates[1][0] - coordinates[0][0]);
        for (int i = 2; i < coordinates.length; i++) {
            int Y = (coordinates[i][1] - coordinates[i - 1][1]);
            int X = (coordinates[i][0] - coordinates[i - 1][0]);
            if (deltaY * X != deltaX * Y)
                return false;
        }
        return true;
    }
}
=======
// 1232. Check If It Is a Straight Line
// https://leetcode.com/problems/check-if-it-is-a-straight-line/description/
public class CheckStrightLineQ1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        // m = y2-y1/x2-x1
        int deltaY = (coordinates[1][1] - coordinates[0][1]);
        int deltaX = (coordinates[1][0] - coordinates[0][0]);
        for (int i = 2; i < coordinates.length; i++) {
            int Y = (coordinates[i][1] - coordinates[i - 1][1]);
            int X = (coordinates[i][0] - coordinates[i - 1][0]);
            if (deltaY * X != deltaX * Y)
                return false;
        }
        return true;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
