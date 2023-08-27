
// 1684. Count the Number of Consistent Strings
import java.util.*;

public class Qno1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> setallowed = new HashSet<Character>();
        for (int i = 0; i < allowed.length(); i++) {
            setallowed.add(allowed.charAt(i));
        }
        int i = 0, j = 0, count = 0;
        for (i = 0; i < words.length; i++) {
            for (j = 0; j < words[i].length(); j++) {
                if (!setallowed.contains(words[i].charAt(j)))
                    break;
            }
            if (j == words[i].length())
                count++;
        }
        return count;
    }
}
