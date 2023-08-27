<<<<<<< HEAD
// 2042. Check if Numbers Are Ascending in a Sentence
// https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/description/
public class areNumbersAscendingQ2042 {
    public boolean areNumbersAscending(String s) {
        int temp = -1;
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - '0';
            if (temp == -1 && (x >= 0 && x <= 9)) {
                temp = x;
                if (i + 1 != s.length() && s.charAt(i + 1) != ' ') {
                    temp = temp * 10 + s.charAt(i + 1) - '0';
                    i++;
                    if (i + 1 != s.length() && s.charAt(i + 1) != ' ') {
                        temp = temp * 10 + s.charAt(i + 1) - '0';
                        i++;
                    }
                }
                System.out.println(temp);
            } else if (temp != -1 && (x >= 0 && x <= 9)) {
                if (i + 1 != s.length() && s.charAt(i + 1) != ' ') {
                    x = x * 10 + s.charAt(i + 1) - '0';
                    i++;
                    if (i + 1 != s.length() && s.charAt(i + 1) != ' ') {
                        x = x * 10 + s.charAt(i + 1) - '0';
                        i++;
                    }
                }
                System.out.println(x);
                if (temp >= x)
                    return false;
                temp = x;
            }
        }
        return true;
    }
}
=======
// 2042. Check if Numbers Are Ascending in a Sentence
// https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/description/
public class areNumbersAscendingQ2042 {
    public boolean areNumbersAscending(String s) {
        int temp = -1;
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - '0';
            if (temp == -1 && (x >= 0 && x <= 9)) {
                temp = x;
                if (i + 1 != s.length() && s.charAt(i + 1) != ' ') {
                    temp = temp * 10 + s.charAt(i + 1) - '0';
                    i++;
                    if (i + 1 != s.length() && s.charAt(i + 1) != ' ') {
                        temp = temp * 10 + s.charAt(i + 1) - '0';
                        i++;
                    }
                }
                System.out.println(temp);
            } else if (temp != -1 && (x >= 0 && x <= 9)) {
                if (i + 1 != s.length() && s.charAt(i + 1) != ' ') {
                    x = x * 10 + s.charAt(i + 1) - '0';
                    i++;
                    if (i + 1 != s.length() && s.charAt(i + 1) != ' ') {
                        x = x * 10 + s.charAt(i + 1) - '0';
                        i++;
                    }
                }
                System.out.println(x);
                if (temp >= x)
                    return false;
                temp = x;
            }
        }
        return true;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
