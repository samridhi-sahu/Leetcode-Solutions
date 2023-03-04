
// 66. Plus One
import java.util.*;
import java.math.*;

class Qno66 {
    public int[] plusOne(int[] digits) {
        String a, c;
        String b = "0";
        for (int i = 0; i < digits.length; i++) {
            a = Integer.toString(digits[i]);
            b = b.concat(a);
        }
        c = Integer.toString(1);
        BigInteger x = new BigInteger(b);
        BigInteger y = new BigInteger(c);
        BigInteger sum = x.add(y);
        b = sum.toString();
        int[] ans = new int[b.length()];
        for (int i = 0; i < b.length(); i++) {
            ans[i] = b.charAt(i) - '0';
        }
        return ans;
    }
}
