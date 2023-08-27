<<<<<<< HEAD
// 278. First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int bad = 0;
        int l = 1, r = n;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            if (!isBadVersion(mid))
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }
=======
// 278. First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int bad = 0;
        int l = 1, r = n;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            if (!isBadVersion(mid))
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
}