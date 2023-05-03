// 258. Add Digits

public class Qno258 {
    public int addDigits(int num) {
        // using loop, n tc
        int ans = 0;
        while (num > 0) {
            ans += num % 10;
            num = num / 10;
            if (num == 0 && ans > 9) {
                num = ans;
                ans = 0;
            }
        }
        // using maths, constant time
        if (num == 0)
            return 0;
        if (num % 9 == 0)
            return 9;
        return num % 9;

        return ans;
    }
}
