// 1207. Unique Number of Occurrences
// https://leetcode.com/problems/unique-number-of-occurrences/description/

import java.util.HashMap;

public class Qno1207 {
    public boolean uniqueOccurrences(int[] arr) {
        int[] temp = new int[1001];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                if (temp[map.get(arr[i])] == 1)
                    return false;
                temp[map.get(arr[i])] = 1;
                map.remove(arr[i]);
            }
        }
        return true;
    }
}
