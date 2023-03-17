// 1431. Kids With the Greatest Number of Candies

import java.util.*;

public class Qno1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>(Arrays.asList(new Boolean[candies.length]));

        int[] temp = new int[candies.length];
        for (int i = 0; i < candies.length; i++) {
            temp[i] = candies[i];
        }
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (max <= candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            candies[i] = temp[i] + extraCandies;
            if (candies[i] >= max) {
                result.add(i, Boolean.TRUE);
            } else {
                result.add(i, Boolean.FALSE);
            }
        }
        while (result.remove(null)) {
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();

        List<Boolean> res = kidsWithCandies(candies, extraCandies);
    }

}
