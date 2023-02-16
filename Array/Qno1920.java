// 1920. Build Array from Permutation

import java.util.Scanner;

class Qno1920 {
    public static int[] buildArray(int[] num) {

        int[] ans = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            ans[i] = num[num[i]];
            System.out.print(ans[i] + " ");
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        Qno1920 obj = new Qno1920();
        int[] result = obj.buildArray(nums);

    }
}