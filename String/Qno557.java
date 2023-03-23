// 557. Reverse Words in a String III

public class Qno557 {
    public String reverseWords(String s) {
        String ans = "";
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            String str = "";
            for (int j = a[i].length() - 1; j >= 0; j--) {
                str += a[i].charAt(j);
            }
            ans += str + " ";
        }
        return ans.trim();
    }
}
