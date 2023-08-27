<<<<<<< HEAD

// 438. Find All Anagrams in a String
// https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
import java.util.*;

public class findAnagramQ438 {
    public List<Integer> findAnagrams(String txt, String pat) {
        int k = pat.length();
        int n = txt.length();
        List<Integer> ans = new ArrayList<Integer>();
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
                    ans.add(i);
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
        return ans;
    }
}
=======

// 438. Find All Anagrams in a String
// https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
import java.util.*;

public class findAnagramQ438 {
    public List<Integer> findAnagrams(String txt, String pat) {
        int k = pat.length();
        int n = txt.length();
        List<Integer> ans = new ArrayList<Integer>();
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
                    ans.add(i);
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
        return ans;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
