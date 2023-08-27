// 374. Guess Number Higher or Lower
public class Qno374 {
    public int guessNumber(int n) {
        int pick = 0;

        // linear search
        // for(int i=1;i<=n;i++){
        // int temp = guess(i);
        // if(temp==0) return i;
        // }

        // binary search
        int l = 1, r = n;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            int temp = guess(mid);
            if (temp == 0)
                return mid;
            else if (temp == 1)
                l = mid + 1;
            else if (temp == -1)
                r = mid - 1;
        }
        return pick;
    }
}
/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */
