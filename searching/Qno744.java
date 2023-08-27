<<<<<<< HEAD
// 744. Find Smallest Letter Greater Than Target
public class Qno744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            if (letters[mid] <= target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        if (l == letters.length)
            return letters[0];
        return letters[l];
    }
}
=======
// 744. Find Smallest Letter Greater Than Target
public class Qno744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            if (letters[mid] <= target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        if (l == letters.length)
            return letters[0];
        return letters[l];
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
