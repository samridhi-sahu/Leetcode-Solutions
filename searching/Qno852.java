<<<<<<< HEAD
// 852. Peak Index in a Mountain Array
public class Qno852 {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + ((r - l) / 2);
            if (arr[mid] > arr[mid + 1])
                r = mid;
            if (arr[mid] < arr[mid + 1])
                l = mid + 1;
        }
        return l;
    }
}
=======
// 852. Peak Index in a Mountain Array
public class Qno852 {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + ((r - l) / 2);
            if (arr[mid] > arr[mid + 1])
                r = mid;
            if (arr[mid] < arr[mid + 1])
                l = mid + 1;
        }
        return l;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
