<<<<<<< HEAD
// 1704. Determine if String Halves Are Alike

public class Qno1704 {
    class Solution {
        public boolean halvesAreAlike(String s) {
            int l = s.length();
            int x = 0;
            int y = 0;
            String a = s.substring(0, l / 2);
            String b = s.substring(l / 2, l);
            for (int i = 0; i < l / 2; i++) {
                if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                        || a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I'
                        || a.charAt(i) == 'O' || a.charAt(i) == 'U')
                    x++;
                if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o'
                        || b.charAt(i) == 'u' || b.charAt(i) == 'A' || b.charAt(i) == 'E' || b.charAt(i) == 'I'
                        || b.charAt(i) == 'O' || b.charAt(i) == 'U')
                    y++;
            }
            if (x == y)
                return true;
            else
                return false;
        }
    }
}
=======
// 1704. Determine if String Halves Are Alike

public class Qno1704 {
    class Solution {
        public boolean halvesAreAlike(String s) {
            int l = s.length();
            int x = 0;
            int y = 0;
            String a = s.substring(0, l / 2);
            String b = s.substring(l / 2, l);
            for (int i = 0; i < l / 2; i++) {
                if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                        || a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I'
                        || a.charAt(i) == 'O' || a.charAt(i) == 'U')
                    x++;
                if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o'
                        || b.charAt(i) == 'u' || b.charAt(i) == 'A' || b.charAt(i) == 'E' || b.charAt(i) == 'I'
                        || b.charAt(i) == 'O' || b.charAt(i) == 'U')
                    y++;
            }
            if (x == y)
                return true;
            else
                return false;
        }
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
