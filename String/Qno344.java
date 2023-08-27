<<<<<<< HEAD
// 344. Reverse String
public class Qno344 {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0, j = n - 1; i <= n - 1 && j >= 0 && j > i && i != j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
=======
// 344. Reverse String
public class Qno344 {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0, j = n - 1; i <= n - 1 && j >= 0 && j > i && i != j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
