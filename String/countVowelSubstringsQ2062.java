// 2062. Count Vowel Substrings of a String
// https://leetcode.com/problems/count-vowel-substrings-of-a-string/description/

import java.util.HashSet;

public class countVowelSubstringsQ2062 {
    public int countVowelSubstrings(String word) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < word.length() - 4; i++) {
            for (int j = i; j < word.length(); j++) {
                char c = word.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    set.add(c);
                    if (set.size() == 5)
                        count++;
                } else
                    break;
            }
            set.clear();
        }
        return count;
    }
}
