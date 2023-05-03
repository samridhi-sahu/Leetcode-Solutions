// 14. Longest Common Prefix
public class Qno14 {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        for (int i = 0; i < strs[0].length(); i++) {
            int j = 1;
            while (j < strs.length) {
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    break;
                } else
                    j++;
            }
            if (j == strs.length)
                s += strs[0].charAt(i);
            else
                break;
        }
        return s;
    }
}
