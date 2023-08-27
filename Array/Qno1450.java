// 1450. Number of Students Doing Homework at a Given Time
public class Qno1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        int len = startTime.length; // startTime.length == endTime.length
        for (int i = 0; i < len; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                count++;
            }
        }
        return count;
    }
}
