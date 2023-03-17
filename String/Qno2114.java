
// 2114. Maximum Number of Words Found in Sentences

import java.util.*;

class Qno2114 {
    public int mostWordsFound(String[] sentences) {
        int len = sentences.length;
        int max = 1;
        for (int i = 0; i < len; i++) {
            int n = sentences[i].length();
            int x = 1;
            for (int j = 0; j < n; j++) {
                if (sentences[i].charAt(j) == ' ') {
                    x++;
                }
            }
            if (max <= x) {
                max = x;
            }
        }
        return max;
    }
}