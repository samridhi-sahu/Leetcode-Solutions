// 69. Sqrt(x)
public class Qno69 {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int l = 0, r = x;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            if ((mid == x / mid) || (mid < x / mid && (mid + 1) > x / (mid + 1)))
                return mid;
            else if (mid > x / mid)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return x;
    }
}
