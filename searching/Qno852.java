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
