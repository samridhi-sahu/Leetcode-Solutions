// 1356. Sort Integers by The Number of 1 Bits
// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/
public class Qno1356 {
    public int[] sortByBits(int[] arr) {
        int[] ones = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String binary = Integer.toBinaryString(arr[i]);
            int count = 0;
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1')
                    count++;
            }
            ones[i] = count;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (ones[i] > ones[j]) {
                    int t = ones[i];
                    ones[i] = ones[j];
                    ones[j] = t;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (ones[i] == ones[j] && arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
