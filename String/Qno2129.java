// 2129. Capitalize the Title
public class Qno2129 {
    class Solution {
        public String capitalizeTitle(String title) {
            String[] a = title.split(" ");
            int len = a.length;
            for (int i = 0; i < len; i++) {
                if (a[i].length() == 1 || a[i].length() == 2) {
                    a[i] = a[i].toLowerCase();
                } else {
                    a[i] = a[i].toLowerCase();
                    char c = Character.toUpperCase(a[i].charAt(0));
                    a[i] = a[i].substring(1, a[i].length());
                    a[i] = c + a[i];
                }
            }
            String str = a[0] + " ";
            for (int i = 1; i < len; i++) {
                str += a[i] + " ";
            }
            return str.trim();
        }
    }
}
