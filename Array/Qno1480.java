<<<<<<< HEAD:Array/Qno1480.java
//  1480. Running Sum of 1d Array

import java.util.Scanner;
import java.util.Arrays;

public class Qno1480 {
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
        Qno1480 obj = new Qno1480();
        int[] result = obj.runningSum(nums);

    }
}
=======
//  1480. Running Sum of 1d Array

import java.util.Scanner;
import java.util.Arrays;

public class Qno1480 {
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
        Qno1480 obj = new Qno1480();
        int[] result = obj.runningSum(nums);

    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f:Array/running_sum.java
