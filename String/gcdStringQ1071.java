// 1071. Greatest Common Divisor of Strings
// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/
public class gcdStringQ1071 {
    public String gcdOfStrings(String str1, String str2) {
        String x = str1.length() < str2.length() ? str1 : str2;
        for (int i = x.length() - 1; i >= 0; i--) {
            if (str1.replace(x, "").equals("") && str2.replace(x, "").equals(""))
                return x;
            else
                x = x.substring(0, i);
        }
        return "";
    }
}
