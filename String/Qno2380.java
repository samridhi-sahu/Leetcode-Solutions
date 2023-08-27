// 2380. Time Needed to Rearrange a Binary String
public class Qno2380 {
    public int secondsToRemoveOccurrences(String s) {
        int sec = 0;
        while (s.contains("01")) {
            s = s.replace("01", "10");
            sec++;
        }
        return sec;
    }
}
