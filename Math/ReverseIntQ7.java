// 7. Reverse Integer
// https://leetcode.com/problems/reverse-integer/description/
public class ReverseIntQ7 {
    public int reverse(int x) {
        int n = 0;
        int temp = x;
        while (Math.abs(temp) > 0) {
            temp = temp / 10;
            n++;
        }
        System.out.println(Math.pow(10, n - 1));
        int ans = 0;
        n = n - 1;
        while (n >= 0) {
            ans += (x % 10) * Math.pow(10, n);
            x = x / 10;
            n--;
        }
        if (ans >= 2147483647 || ans <= -2147483648)
            return 0;
        return ans;
    }
}
