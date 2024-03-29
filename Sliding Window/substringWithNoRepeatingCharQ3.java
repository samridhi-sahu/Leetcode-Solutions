<<<<<<< HEAD
// 3. Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashMap;

public class substringWithNoRepeatingCharQ3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0;
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            } else
                map.put(s.charAt(j), 1);
            if (map.size() == j - i + 1) {
                if (j - i + 1 > max)
                    max = j - i + 1;
                j++;
            } else if (map.size() < j - i + 1) {
                while (map.size() < j - i + 1) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0)
                        map.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
=======
// 3. Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashMap;

public class substringWithNoRepeatingCharQ3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0;
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            } else
                map.put(s.charAt(j), 1);
            if (map.size() == j - i + 1) {
                if (j - i + 1 > max)
                    max = j - i + 1;
                j++;
            } else if (map.size() < j - i + 1) {
                while (map.size() < j - i + 1) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0)
                        map.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
