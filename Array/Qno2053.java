
// 2053. Kth Distinct String in an Array
import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> list = new ArrayList<String>();
        int i = 0, j = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (i != j && arr[i].equals(arr[j]))
                    break;
            }
            if (j == arr.length) {
                list.add(arr[i]);
            }
        }
        if (k > list.size())
            return "";
        return list.get(k - 1);
    }
}