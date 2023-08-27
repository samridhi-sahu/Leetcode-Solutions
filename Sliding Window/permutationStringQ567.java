
// 567. Permutation in String
// https://leetcode.com/problems/permutation-in-string/description/
import java.util.*;

public class permutationStringQ567 {
    public boolean checkInclusion(String pat, String txt) {
        int k = pat.length();
        int n = txt.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < k; i++) {
            if (map.containsKey(pat.charAt(i))) {
                map.put(pat.charAt(i), map.get(pat.charAt(i)) + 1);
            } else
                map.put(pat.charAt(i), 1);
        }
        int count = map.size();
        int i = 0, j = 0;
        while (j < n) {
            if (map.containsKey(txt.charAt(j))) {
                map.put(txt.charAt(j), map.get(txt.charAt(j)) - 1);
            }
            if (map.containsKey(txt.charAt(j)) && map.get(txt.charAt(j)) == 0) {
                count--;
            }
            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                if (count == 0)
                    return true;
                if (map.containsKey(txt.charAt(i))) {
                    map.put(txt.charAt(i), map.get(txt.charAt(i)) + 1);
                }
                if (map.containsKey(txt.charAt(i)) && map.get(txt.charAt(i)) == 1) {
                    count++;
                }
                i++;
                j++;
            }
        }
        return false;
    }
}
