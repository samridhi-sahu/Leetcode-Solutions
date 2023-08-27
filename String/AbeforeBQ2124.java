// 2124. Check if All A's Appears Before All B's
// https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/description/
public class AbeforeBQ2124 {
    public boolean checkString(String s) {
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b')
                flag = 1;
            if (flag == 1 && s.charAt(i) == 'a')
                return false;
        }
        return true;
    }
}
