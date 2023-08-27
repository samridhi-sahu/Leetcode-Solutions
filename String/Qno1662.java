// 1662. Check If Two String Arrays are Equivalent

public class Qno1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = word1[0];
        for (int i = 1; i < word1.length; i++) {
            str1 = str1.concat(word1[i]);
        }
        String str2 = word2[0];
        for (int i = 1; i < word2.length; i++) {
            str2 = str2.concat(word2[i]);
        }
        return str1.equals(str2);
    }
}
