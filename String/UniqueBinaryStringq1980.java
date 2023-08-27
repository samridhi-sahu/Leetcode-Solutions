<<<<<<< HEAD

// 1980. Find Unique Binary String
// https://leetcode.com/problems/find-unique-binary-string/description/
import java.util.*;

public class UniqueBinaryStringq1980 {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        for (int i = 0; i <= ((int) Math.pow(2, n)) - 1; i++) {
            String s = Integer.toString(i, 2);
            if (s.length() != n) {
                int j = s.length();
                while (j < n) {
                    s = '0' + s;
                    j++;
                }
            }
            if (!Arrays.asList(nums).contains(s))
                return s;
        }
        return null;
    }
}
=======

// 1980. Find Unique Binary String
// https://leetcode.com/problems/find-unique-binary-string/description/
import java.util.*;

public class UniqueBinaryStringq1980 {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        for (int i = 0; i <= ((int) Math.pow(2, n)) - 1; i++) {
            String s = Integer.toString(i, 2);
            if (s.length() != n) {
                int j = s.length();
                while (j < n) {
                    s = '0' + s;
                    j++;
                }
            }
            if (!Arrays.asList(nums).contains(s))
                return s;
        }
        return null;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
