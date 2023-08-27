<<<<<<< HEAD
// 9. Palindrome Number

public class Qno9 {
    public boolean isPalindrome(int x) {
        if (x < 10 && x >= 0)
            return true;
        else {
            String s1 = Integer.toString(x);
            String s2 = "";
            while (x > 0) {
                s2 += x % 10;
                x = x / 10;
            }
            return s1.equals(s2);
        }
    }
}
=======
// 9. Palindrome Number

public class Qno9 {
    public boolean isPalindrome(int x) {
        if (x < 10 && x >= 0)
            return true;
        else {
            String s1 = Integer.toString(x);
            String s2 = "";
            while (x > 0) {
                s2 += x % 10;
                x = x / 10;
            }
            return s1.equals(s2);
        }
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
