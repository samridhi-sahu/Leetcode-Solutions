<<<<<<< HEAD
import java.util.*;

class Qno167 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[] { map.get(target - numbers[i]) + 1, i + 1 };
            }
            map.put(numbers[i], i);
        }
        return null;
    }
=======
import java.util.*;

class Qno167 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[] { map.get(target - numbers[i]) + 1, i + 1 };
            }
            map.put(numbers[i], i);
        }
        return null;
    }
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
}