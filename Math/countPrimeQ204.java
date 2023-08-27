// 204. Count Primes
// https://leetcode.com/problems/count-primes/description/
public class countPrimeQ204 {
    public int countPrimes(int n) {
        boolean[] check = new boolean[n + 2];
        for (int i = 2; i < n + 2; i++) {
            check[i] = true;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (check[i]) {
                count++;
                for (int j = 2 * i; j < n; j = j + i) {
                    check[j] = false;
                }
            }
        }
        return count;
    }
}
