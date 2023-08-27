<<<<<<< HEAD
public class Qno121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (min < prices[i]) {
                min = prices[i];
            }
        }
        int max = 0;
        int temp = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            temp = prices[i] - min;
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }
}
=======
public class Qno121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (min < prices[i]) {
                min = prices[i];
            }
        }
        int max = 0;
        int temp = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            temp = prices[i] - min;
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
