// 633. Sum of Square Numbers
public class Qno633 {
    public boolean judgeSquareSum(int c) {
        if (c == 0 || c == 1)
            return true;

        // binary search

        // int a = 0;
        // int l = 0, r = c - (a * a);
        // while (l <= r) {
        // double mid = l + ((r - l) / 2);
        // if (mid == (c - (a * a)) / mid)
        // return true;
        // else if (mid > (c - (a * a)) / mid)
        // r = (int) (mid - 1);
        // else
        // l = (int) (mid + 1);
        // }
        // for (a = 1; a <= c / a; a++) {
        // l = 0;
        // r = c - (a * a);
        // while (l <= r) {
        // double mid = l + ((r - l) / 2);
        // if (mid == (c - (a * a)) / mid)
        // return true;
        // else if (mid > (c - (a * a)) / mid)
        // r = (int) (mid - 1);
        // else
        // l = (int) (mid + 1);
        // }
        // }

        // two pointer

        long l = 0, r = (long) Math.sqrt(c);
        while (l <= r) {
            long d = (l * l) + (r * r);
            if (d == c)
                return true;
            else if ((l * l) + (r * r) > c)
                r--;
            else
                l++;
        }
        return false;
    }
}
