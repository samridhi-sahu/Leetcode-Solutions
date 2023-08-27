<<<<<<< HEAD
// 1534. Count Good Triplets
public class Qno1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int l = arr.length;
        int x, y, z;
        int count = 0;
        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {
                    x = arr[i] - arr[j];
                    if (x < 0) {
                        x *= -1;
                    }
                    y = arr[j] - arr[k];
                    if (y < 0) {
                        y *= -1;
                    }
                    z = arr[i] - arr[k];
                    if (z < 0) {
                        z *= -1;
                    }
                    if (i < j && j < k && x <= a && y <= b && z <= c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
=======
// 1534. Count Good Triplets
public class Qno1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int l = arr.length;
        int x, y, z;
        int count = 0;
        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {
                    x = arr[i] - arr[j];
                    if (x < 0) {
                        x *= -1;
                    }
                    y = arr[j] - arr[k];
                    if (y < 0) {
                        y *= -1;
                    }
                    z = arr[i] - arr[k];
                    if (z < 0) {
                        z *= -1;
                    }
                    if (i < j && j < k && x <= a && y <= b && z <= c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
