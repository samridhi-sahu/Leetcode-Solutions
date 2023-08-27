<<<<<<< HEAD
// 832. Flipping an Image

import java.util.*;

public class Qno832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] rev = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rev[i][j] = image[i][n - 1 - j];
                if (rev[i][j] == 0) {
                    rev[i][j] = 1;
                } else {
                    rev[i][j] = 0;
                }
            }
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] ans = flipAndInvertImage(mat);
        System.out.println(ans);
    }
}
=======
// 832. Flipping an Image

import java.util.*;

public class Qno832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] rev = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rev[i][j] = image[i][n - 1 - j];
                if (rev[i][j] == 0) {
                    rev[i][j] = 1;
                } else {
                    rev[i][j] = 0;
                }
            }
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] ans = flipAndInvertImage(mat);
        System.out.println(ans);
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
