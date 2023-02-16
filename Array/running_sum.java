//  1480. Running Sum of 1d Array

import java.util.Scanner;
import java.util.Arrays;

public class running_sum {
    public static int[] runningSum(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            num[i + 1] = num[i] + num[i + 1];
        }
        System.out.println(Arrays.toString(num));
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        running_sum obj = new running_sum();
        int[] result = obj.runningSum(nums);

    }
}
