// 5. Longest Palindromic Substring
// https://leetcode.com/problems/longest-palindromic-substring/description/
public class LongestPalindromeSubstringQ5 {
    public String longestPalindrome(String s) {
        int i = 0, j = s.length();
        while (j > 0) {
            i = 0;
            while (i + j <= s.length()) {
                if (isPalindrome(s.substring(i, i + j)))
                    return s.substring(i, i + j);
                i++;
            }
            j--;
        }
        return "";
    }

    boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < s.length() && j >= 0 && i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
