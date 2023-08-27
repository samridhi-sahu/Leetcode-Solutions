// 125. Valid Palindrome
public class Qno125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                str += s.charAt(i);
            }
        }
        if (str.equals(""))
            return true;
        for (int i = 0, j = str.length() - 1; i < str.length() && j >= 0; i++, j--) {
            if (i > j || i == j) {
                return true;
            }
            if (str.charAt(i) != str.charAt(j))
                break;
        }
        return false;
    }
}
