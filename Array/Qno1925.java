<<<<<<< HEAD
// 1925. Count Square Sum Triples
public class Qno1925 {
    public int countTriples(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if ((i * i) + (j * j) == (k * k)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
=======
// 1925. Count Square Sum Triples
public class Qno1925 {
    public int countTriples(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if ((i * i) + (j * j) == (k * k)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
