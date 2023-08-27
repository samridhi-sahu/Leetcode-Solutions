<<<<<<< HEAD
// 1095. Find in Mountain Array

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + ((r - l) / 2);
            if (mountainArr.get(mid) > mountainArr.get(mid + 1))
                r = mid;
            else
                l = mid + 1;
        }
        int peak = l;
        l = 0;
        r = peak;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            if (mountainArr.get(mid) == target)
                return mid;
            else if (mountainArr.get(mid) > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        l = peak + 1;
        r = n - 1;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            if (mountainArr.get(mid) == target)
                return mid;
            else if (mountainArr.get(mid) > target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
}
=======
// 1095. Find in Mountain Array

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + ((r - l) / 2);
            if (mountainArr.get(mid) > mountainArr.get(mid + 1))
                r = mid;
            else
                l = mid + 1;
        }
        int peak = l;
        l = 0;
        r = peak;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            if (mountainArr.get(mid) == target)
                return mid;
            else if (mountainArr.get(mid) > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        l = peak + 1;
        r = n - 1;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            if (mountainArr.get(mid) == target)
                return mid;
            else if (mountainArr.get(mid) > target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
