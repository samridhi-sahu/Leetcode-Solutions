// 520. Detect Capital
public class Qno520 {
    class Solution {
        public boolean detectCapitalUse(String word) {
            int l = word.length();
            int x = 0;
            for (int i = 0; i < l; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    x++;
                } else {
                    x--;
                }
            }
            if (x == l || x == -l)
                return true;
            else if (Character.isUpperCase(word.charAt(0)) && x == 2 - l)
                return true;
            else
                return false;
        }
    }
}
