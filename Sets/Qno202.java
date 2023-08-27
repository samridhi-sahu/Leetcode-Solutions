
// 202. Happy Number
import java.util.*;

class Qno202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        if (n == 1)
            return true;
        int temp = n, count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        while (n > 0) {
            int d = 0;
            while (n > 0) {
                d += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = d;
            if (n == 1)
                return true;
            if (set.contains(n) || n > 81 * count)
                break;
            set.add(n);
            temp = n;
            count = 0;
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
        }
        return false;
    }
}
