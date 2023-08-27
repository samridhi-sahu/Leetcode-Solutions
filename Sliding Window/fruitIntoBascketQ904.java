// https://leetcode.com/problems/fruit-into-baskets/description/
// 904. Fruit Into Baskets

import java.util.HashMap;

public class fruitIntoBascketQ904 {
    public int totalFruit(int[] fruits) {
        int i = 0, j = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (j < fruits.length) {
            if (map.containsKey(fruits[j])) {
                map.put(fruits[j], map.get(fruits[j]) + 1);
            } else
                map.put(fruits[j], 1);
            if (map.size() < 2) {
                max = map.get(fruits[j]);
                j++;
            } else if (map.size() == 2) {
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                while (map.size() > 2) {
                    map.put(fruits[i], map.get(fruits[i]) - 1);
                    if (map.get(fruits[i]) == 0)
                        map.remove(fruits[i]);
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
