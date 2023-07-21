// 1952. Three Divisors
// https://leetcode.com/problems/smallest-even-multiple/description/
public class threeDivisorQ1952 {
    public boolean isThree(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 1)
            return true;
        return false;
    }
}
