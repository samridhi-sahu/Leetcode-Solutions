<<<<<<< HEAD
// 1016. Binary String With Substrings Representing 1 To N
// https://leetcode.com/problems/binary-string-with-substrings-representing-1-to-n/description/

public class Qno1016 {
    public boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
            String temp = Integer.toString(i, 2);
            if (!s.contains(temp))
                return false;
        }
        return true;
    }
}
=======
// 1016. Binary String With Substrings Representing 1 To N
// https://leetcode.com/problems/binary-string-with-substrings-representing-1-to-n/description/

public class Qno1016 {
    public boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
            String temp = Integer.toString(i, 2);
            if (!s.contains(temp))
                return false;
        }
        return true;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
