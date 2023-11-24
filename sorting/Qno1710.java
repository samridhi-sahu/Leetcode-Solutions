// 1710. Maximum Units on a Truck
// https://leetcode.com/problems/maximum-units-on-a-truck/description/
public class Qno1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        sort(boxTypes);
        int max = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            if (boxTypes[i][0] <= truckSize) {
                max = (boxTypes[i][1] * boxTypes[i][0]) + max;
                truckSize = truckSize - boxTypes[i][0];
            } else {
                while (truckSize > 0) {
                    max += boxTypes[i][1];
                    truckSize--;
                }
            }
        }
        return max;
    }

    void sort(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][1] < arr[j][1]) {
                    int temp2 = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp2;
                    int temp1 = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp1;
                }
            }
        }
    }
}
