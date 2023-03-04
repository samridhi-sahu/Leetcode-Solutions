// 989. Add to Array-Form of Integer

import java.util.*;
import java.math.*;

public class Qno989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList();
        String s;
        String str1 = "0";
        String str2 = Integer.toString(k);
        for (int j = 0; j < num.length; j++) {
            s = Integer.toString(num[j]);
            str1 = str1.concat(s);
        }
        BigInteger x = new BigInteger(str1);
        BigInteger y = new BigInteger(str2);
        BigInteger sum = x.add(y);
        str1 = sum.toString();
        char c;
        for (int i = 0; i < str1.length(); i++) {
            c = str1.charAt(i);
            int b = c - '0';
            ans.add(i, b);
        }
        while (ans.remove(null)) {
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        List<Integer> ans = addToArrayForm(nums, k);
        System.out.println(ans);
    }
}
