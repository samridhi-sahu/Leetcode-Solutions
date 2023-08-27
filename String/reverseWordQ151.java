<<<<<<< HEAD
// 151. Reverse Words in a String
// https://leetcode.com/problems/reverse-words-in-a-string/description/
public class reverseWordQ151 {
    public String reverseWords(String s) {
        String str = "", temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                temp = (s.charAt(i) + temp);
            else if (!temp.equals("")) {
                str = str + " " + temp;
                temp = "";
            }
        }
        str = str + " " + temp;
        return str.trim();
    }
}
=======
// 151. Reverse Words in a String
// https://leetcode.com/problems/reverse-words-in-a-string/description/
public class reverseWordQ151 {
    public String reverseWords(String s) {
        String str = "", temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                temp = (s.charAt(i) + temp);
            else if (!temp.equals("")) {
                str = str + " " + temp;
                temp = "";
            }
        }
        str = str + " " + temp;
        return str.trim();
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
