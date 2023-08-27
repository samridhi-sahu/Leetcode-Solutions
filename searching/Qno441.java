// 441. Arranging Coins
public class Qno441 {
    public int arrangeCoins(int n) {
        long l = 1, r = n;
        while (l <= r) {
            long mid = l + ((r - l) / 2);
            long sum = mid * (mid + 1) / 2;
            if (sum == n)
                return (int) mid;
            else if (sum > n)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return (int) r;
    }
}
