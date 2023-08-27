<<<<<<< HEAD
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
=======
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
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
