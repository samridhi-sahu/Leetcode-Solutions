// 1876. Substrings of Size Three with Distinct Characters
// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/

import java.util.HashMap;

public class Q1876 {
    public int countGoodSubstrings(String s) {
        int i = 0, j = 0, count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (j < s.length()) {
            // calculation
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            } else
                map.put(s.charAt(j), 1);
            if (j - i + 1 < 3)
                j++;
            else if (j - i + 1 == 3) {
                if (map.size() == 3)
                    count++;
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if (map.get(s.charAt(i)) == 0)
                    map.remove(s.charAt(i));
                i++;
                j++;
            }
        }
        return count;
    }
}
