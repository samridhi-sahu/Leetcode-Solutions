<<<<<<< HEAD
// 1365. How Many Numbers Are Smaller Than the Current Number

import java.util.*;

public class Qno1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    ++count;
                }
            }
            answer[i] = count;
        }
        System.out.println(Arrays.toString(answer));
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int[] res = smallerNumbersThanCurrent(nums);
    }
}
=======
// 1365. How Many Numbers Are Smaller Than the Current Number

import java.util.*;

public class Qno1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    ++count;
                }
            }
            answer[i] = count;
        }
        System.out.println(Arrays.toString(answer));
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int[] res = smallerNumbersThanCurrent(nums);
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
