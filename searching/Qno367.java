<<<<<<< HEAD
// 367. Valid Perfect Square
public class Qno367 {
    public boolean isPerfectSquare(int num) {
        int x = num;
        if (x == 1)
            return true;
        int l = 0, r = x;
        while (l <= r) {
            double mid = l + ((r - l) / 2);
            if ((mid == x / mid))
                return true;
            else if (mid > x / mid)
                r = (int)(mid - 1);
            else
                l = (int)(mid + 1);
        }
        return false;
}
=======
// 367. Valid Perfect Square
public class Qno367 {
    public boolean isPerfectSquare(int num) {
        int x = num;
        if (x == 1)
            return true;
        int l = 0, r = x;
        while (l <= r) {
            double mid = l + ((r - l) / 2);
            if ((mid == x / mid))
                return true;
            else if (mid > x / mid)
                r = (int)(mid - 1);
            else
                l = (int)(mid + 1);
        }
        return false;
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
