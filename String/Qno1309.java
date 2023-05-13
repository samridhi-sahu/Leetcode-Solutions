// 1309. Decrypt String from Alphabet to Integer Mapping
class Solution {
    public String freqAlphabets(String s) {
        int i;
        String str = "";
        for (i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                String temp = "" + s.charAt(i) + s.charAt(i + 1);
                int x = Integer.parseInt(temp);
                char c = (char) ('a' + x - 1);
                str = str + c;
                i = i + 2;
            } else {
                char c = (char) ('a' + (s.charAt(i) - '0') - 1);
                str = str + c;
            }
        }
        return str;
    }
}