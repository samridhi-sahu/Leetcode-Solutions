// 1137. N-th Tribonacci Number
// https://leetcode.com/problems/n-th-tribonacci-number/description/
public class tribonacciNumQ1137 {
    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        // using recursion
        // return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        int ans = 0, prev1 = 0, prev2 = 1, prev3 = 1;
        for (int i = 3; i <= n; i++) {
            ans = prev1 + prev2 + prev3;
            prev1 = prev2;
            prev2 = prev3;
            prev3 = ans;
        }
        return ans;
    }
}
