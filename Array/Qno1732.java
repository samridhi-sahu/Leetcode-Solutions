// 1732. Find the Highest Altitude

import java.util.*;

public class Qno1732 {

    public static int largestAltitude(int[] gain) {
        int n = 1 + gain.length;
        int[] altitude = new int[n];
        altitude[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            altitude[i + 1] = altitude[i] + gain[i];
        }
        int largest = altitude[0];
        for (int i = 0; i < n; i++) {
            if (largest <= altitude[i]) {
                largest = altitude[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gain = new int[n];
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }
}
