// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/description/
class Solution {
    public int fib(int n) {
        // using recursion
        // if(n==0) return 0;
        // if(n==1) return 1;
        // int ans = fib(n-1)+fib(n-2);
        // return ans;

        // using loop
        int ans = 0, prev1 = 0, prev2 = 1;
        for (int i = 1; i <= n; i++) {
            prev1 = prev2;
            prev2 = ans;
            ans = prev1 + prev2;
        }
        return ans;
    }
}