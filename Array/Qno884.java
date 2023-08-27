<<<<<<< HEAD

// 884. Uncommon Words from Two Sentences
import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<String>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        int i = 0, j = 0;
        for (i = 0; i < words1.length; i++) {
            for (j = 0; j < words1.length; j++) {
                if (i != j && words1[i].equals(words1[j])) {
                    break;
                }
            }
            if (j == words1.length) {
                for (j = 0; j < words2.length; j++) {
                    if (words1[i].equals(words2[j])) {
                        break;
                    }
                }
                if (j == words2.length) {
                    list.add(words1[i]);
                }
            }
        }
        for (i = 0; i < words2.length; i++) {
            for (j = 0; j < words2.length; j++) {
                if (i != j && words2[i].equals(words2[j])) {
                    break;
                }
            }
            if (j == words2.length) {
                for (j = 0; j < words1.length; j++) {
                    if (words2[i].equals(words1[j])) {
                        break;
                    }
                }
                if (j == words1.length) {
                    list.add(words2[i]);
                }
            }
        }
        String[] arr = list.toArray(new String[0]);
        return arr;
    }
=======

// 884. Uncommon Words from Two Sentences
import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<String>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        int i = 0, j = 0;
        for (i = 0; i < words1.length; i++) {
            for (j = 0; j < words1.length; j++) {
                if (i != j && words1[i].equals(words1[j])) {
                    break;
                }
            }
            if (j == words1.length) {
                for (j = 0; j < words2.length; j++) {
                    if (words1[i].equals(words2[j])) {
                        break;
                    }
                }
                if (j == words2.length) {
                    list.add(words1[i]);
                }
            }
        }
        for (i = 0; i < words2.length; i++) {
            for (j = 0; j < words2.length; j++) {
                if (i != j && words2[i].equals(words2[j])) {
                    break;
                }
            }
            if (j == words2.length) {
                for (j = 0; j < words1.length; j++) {
                    if (words2[i].equals(words1[j])) {
                        break;
                    }
                }
                if (j == words1.length) {
                    list.add(words2[i]);
                }
            }
        }
        String[] arr = list.toArray(new String[0]);
        return arr;
    }
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
}