// 1512. Number of Good Pairs

import java.util.*;

public class Qno1512 {

    public static int numIdenticalPairs(int[] nums) {
        int goodpairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    goodpairs++;
                }
            }
        }
        return goodpairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int res = numIdenticalPairs(nums);
        System.out.println(res);
    }
}
