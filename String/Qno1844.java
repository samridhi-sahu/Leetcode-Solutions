<<<<<<< HEAD
// 1844. Replace All Digits with Characters
public class Qno1844 {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            arr[i + 1] = (char) (arr[i] + (arr[i + 1] - '0'));
        }
        s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }
}
=======
// 1844. Replace All Digits with Characters
public class Qno1844 {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            arr[i + 1] = (char) (arr[i] + (arr[i + 1] - '0'));
        }
        s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
