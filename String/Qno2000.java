<<<<<<< HEAD
// 2000. Reverse Prefix of Word
public class Qno2000 {
    public String reversePrefix(String word, char ch) {
        int n = word.indexOf(ch);
        if (n >= 0) {
            String s2 = word.substring(n + 1, word.length());
            String s1 = "";
            for (int i = n; i >= 0; i--) {
                s1 += word.charAt(i);
            }
            return s1 + s2;
        } else
            return word;
    }
}
=======
// 2000. Reverse Prefix of Word
public class Qno2000 {
    public String reversePrefix(String word, char ch) {
        int n = word.indexOf(ch);
        if (n >= 0) {
            String s2 = word.substring(n + 1, word.length());
            String s1 = "";
            for (int i = n; i >= 0; i--) {
                s1 += word.charAt(i);
            }
            return s1 + s2;
        } else
            return word;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
