<<<<<<< HEAD
// 2108. Find First Palindromic String in the Array
public class Qno2108 {
    public String firstPalindrome(String[] words) {
        for (int k = 0; k < words.length; k++) {
            for (int i = 0, j = words[k].length() - 1; i < words[k].length() && j >= 0; i++, j--) {
                if (i > j || i == j) {
                    return words[k];
                }
                if (words[k].charAt(i) != words[k].charAt(j))
                    break;
            }
        }
        return "";
    }
}
=======
// 2108. Find First Palindromic String in the Array
public class Qno2108 {
    public String firstPalindrome(String[] words) {
        for (int k = 0; k < words.length; k++) {
            for (int i = 0, j = words[k].length() - 1; i < words[k].length() && j >= 0; i++, j--) {
                if (i > j || i == j) {
                    return words[k];
                }
                if (words[k].charAt(i) != words[k].charAt(j))
                    break;
            }
        }
        return "";
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
