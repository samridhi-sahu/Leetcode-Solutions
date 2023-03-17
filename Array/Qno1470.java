// 1470. Shuffle the Array

import java.util.Scanner;
import java.util.Arrays;

public class Qno1470 {

    public static int[] shuffle(int[] num, int m) {
        int[] temp = new int[2 * m];
        for (int i = 0; i < 2 * m; i++) {
            temp[i] = num[i];
        }
        for (int i = 0; i < m; i++) {
            num[2 * i] = temp[i];
            num[2 * i + 1] = temp[i + m];
        }
        System.out.println(Arrays.toString(num));
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] res = shuffle(nums, n);
    }
}
