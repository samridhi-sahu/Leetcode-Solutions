<<<<<<< HEAD
// 1769. Minimum Number of Operations to Move All Balls to Each Box
class Solution {
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int count = 0;
            arr[i] = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (j != i && boxes.charAt(j) == '1') {
                    int temp = i - j;
                    if (temp < 0)
                        temp = -temp;
                    count += temp;
                }
            }
            arr[i] += count;
        }
        return arr;
    }
}
=======
// 1769. Minimum Number of Operations to Move All Balls to Each Box
class Solution {
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int count = 0;
            arr[i] = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (j != i && boxes.charAt(j) == '1') {
                    int temp = i - j;
                    if (temp < 0)
                        temp = -temp;
                    count += temp;
                }
            }
            arr[i] += count;
        }
        return arr;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
