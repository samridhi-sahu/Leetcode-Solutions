// 2119. A Number After a Double Reversal
// https://leetcode.com/problems/a-number-after-a-double-reversal/description/
public class DoubleReverseQ2119 {
    public boolean isSameAfterReversals(int x) {
        int n = count(x) - 1;
        int reversed1 = reverse(x, n);
        n = count(reversed1) - 1;
        int reversed2 = reverse(reversed1, n);
        return reversed2 == x ? true : false;
    }

    int count(int num) {
        int n = 0;
        while (num > 0) {
            num = num / 10;
            n++;
        }
        return n;
    }

    int reverse(int num, int n) {
        int rev = 0;
        while (n >= 0) {
            rev += (num % 10) * Math.pow(10, n);
            num = num / 10;
            n--;
        }
        return rev;
    }
}
