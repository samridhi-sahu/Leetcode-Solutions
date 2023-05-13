// 1784. Check if Binary String Has at Most One Segment of Ones
// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/

public class Qno1784 {
    public boolean checkOnesSegment(String s) {
        if (s.contains("01"))
            return false;
        return true;
    }
}
