// 17. Letter Combinations of a Phone Number
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.util.*;

public class letterCombinationsQ17 {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        solve(digits, "", 0, list, mapping);
        return list;
    }

    void solve(String digits, String temp, int i, List<String> list, String[] mapping) {
        if (i >= digits.length()) {
            if (!temp.equals(""))
                list.add(temp);
            return;
        }
        String s = mapping[digits.charAt(i) - '0'];
        for (int j = 0; j < s.length(); j++) {
            temp += s.charAt(j);
            solve(digits, temp, i + 1, list, mapping);
            temp = temp.substring(0, temp.length() - 1);
        }
    }
}
