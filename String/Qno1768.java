<<<<<<< HEAD
// 1768. Merge Strings Alternately
public class Qno1768 {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length())
                merged += word1.charAt(i);
            if (i < word2.length())
                merged += word2.charAt(i);
        }
        return merged;
    }
}
=======
// 1768. Merge Strings Alternately
public class Qno1768 {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length())
                merged += word1.charAt(i);
            if (i < word2.length())
                merged += word2.charAt(i);
        }
        return merged;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
