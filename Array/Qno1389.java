<<<<<<< HEAD
// 1389. Create Target Array in the Given Order

import java.util.*;

public class Qno1389 {

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new LinkedList<Integer>();
        int x, y;
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            x = index[i];
            y = nums[i];
            result.add(x, y);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = result.get(i);
        }
        System.out.print(Arrays.toString(target));
        return target;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] index = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            index[i] = sc.nextInt();
        }
        int[] res = createTargetArray(nums, index);
    }
}
=======
// 1389. Create Target Array in the Given Order

import java.util.*;

public class Qno1389 {

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new LinkedList<Integer>();
        int x, y;
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            x = index[i];
            y = nums[i];
            result.add(x, y);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = result.get(i);
        }
        System.out.print(Arrays.toString(target));
        return target;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] index = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            index[i] = sc.nextInt();
        }
        int[] res = createTargetArray(nums, index);
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
