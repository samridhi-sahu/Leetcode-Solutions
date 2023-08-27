// 1346. Check If N and Its Double Exist
public class Qno1346 {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if ((map.containsKey(2 * arr[i]) && arr[i] != 0))
                return true;
            if (map.containsKey(2 * arr[i]) && arr[i] == 0 && map.get(arr[i]) >= 2)
                return true;
        }
        return false;
    }
}
