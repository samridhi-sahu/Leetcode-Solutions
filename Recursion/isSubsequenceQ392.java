// 392. Is Subsequence
// https://leetcode.com/problems/is-subsequence/description/

import java.util.List;

public class isSubsequenceQ392 {
    public boolean isSubsequence(String s, String t) {
        // using recursion, but getting memory limit exceed error in worst case
        // List<String> list = new ArrayList<>();
        // solve(t, "", 0, list);
        // for(int i=0; i<list.size();i++){
        // if(s.equals(list.get(i))) return true;
        // }
        // return false;

        // using two pointer method
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) != t.charAt(j))
                j++;
            else {
                i++;
                j++;
            }
        }
        if (i == s.length())
            return true;
        return false;
    }

    void solve(String t, String temp, int i, List<String> list) {
        if (i >= t.length()) {
            list.add(temp);
            return;
        }
        // exclude
        solve(t, temp, i + 1, list);
        // include
        temp += t.charAt(i);
        solve(t, temp, i + 1, list);
    }
}
