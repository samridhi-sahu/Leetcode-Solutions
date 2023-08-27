
// 1929. Concatenation of Array

import java.util.Scanner;
import java.util.Arrays;

public class Qno1929 {

    public static int[] getConcatenation(int[] num) {
        int[] ans = new int[2 * num.length];
        for (int i = 0; i < num.length; i++) {
            ans[i] = num[i];
        }
        for (int i = num.length; i < 2 * num.length; i++) {
            ans[i] = num[i - num.length];
        }
        System.out.println(Arrays.toString(ans));

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int[] res = getConcatenation(nums);
    }
}
