<<<<<<< HEAD
// 605. Can Place Flowers
// https://leetcode.com/problems/can-place-flowers/
public class canFlowerPlaceQ605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if ((flowerbed.length == 1 && flowerbed[0] == 0) || n == 0)
            return true;
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
            if (n == 0)
                return true;
        }
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] == 1) {
                i++;
            } else if (flowerbed[i + 1] != 1 && flowerbed[i - 1] != 1) {
                flowerbed[i] = 1;
                n--;
                if (n == 0)
                    return true;
                i++;
            }
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            n--;
            if (n == 0)
                return true;
        }
        return false;
    }
}
=======
// 605. Can Place Flowers
// https://leetcode.com/problems/can-place-flowers/
public class canFlowerPlaceQ605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if ((flowerbed.length == 1 && flowerbed[0] == 0) || n == 0)
            return true;
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
            if (n == 0)
                return true;
        }
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] == 1) {
                i++;
            } else if (flowerbed[i + 1] != 1 && flowerbed[i - 1] != 1) {
                flowerbed[i] = 1;
                n--;
                if (n == 0)
                    return true;
                i++;
            }
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            n--;
            if (n == 0)
                return true;
        }
        return false;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
