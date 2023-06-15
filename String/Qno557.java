// 557. Reverse Words in a String III
// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

public class Qno557 {
    public String reverseWords(String s) {

        // tc n2

        // String ans = "";
        // String[] a = s.split(" ");
        // for(int i=0;i<a.length;i++){
        // String str = "";
        // for(int j=a[i].length()-1;j>=0;j--){
        // str += a[i].charAt(j);
        // }
        // ans += str+" ";
        // }
        // return ans.trim();

        // tc n

        s = " " + s;
        String ans = "";
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
            if (s.charAt(i) == ' ') {
                ans = temp + ans;
                temp = "";
            }
        }
        return ans.trim();
    }
}