// 20. Valid Parentheses
//https://leetcode.com/problems/valid-parentheses/description/

public class Qno20 {
    public boolean isValid(String s) {
        int j = -1;
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                arr[++j] = c;
            } else {
                if (j >= 0 && ((arr[j] == '(' && c == ')') || (arr[j] == '{' && c == '}')
                        || (arr[j] == '[' && c == ']'))) {
                    j--;
                } else
                    return false;
            }
        }
        return j == -1;
    }
}
