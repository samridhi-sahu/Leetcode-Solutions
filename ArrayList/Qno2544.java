
// 2544. Alternating Digit Sum
import java.util.*;

public class Qno2544 {
    public int alternateDigitSum(int n) {
        List<Integer> list = new ArrayList<Integer>();
        while (n > 0) {
            list.add(0, n % 10);
            n = n / 10;
        }
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            int item = list.get(i);
            if (i % 2 != 0)
                item = -item;
            ans += item;
        }
        return ans;
    }
}
