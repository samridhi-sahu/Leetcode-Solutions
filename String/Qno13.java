// 13. Roman to Integer
class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int n = s.length();
        int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                if (i + 1 < n && s.charAt(i + 1) == 'V') {
                    num = num + V - I;
                    i++;
                } else if (i + 1 < n && s.charAt(i + 1) == 'X') {
                    num = num + X - I;
                    i++;
                } else {
                    num = num + I;
                }
            } else if (s.charAt(i) == 'V') {
                num = num + V;
            } else if (s.charAt(i) == 'X') {
                if (i + 1 < n && s.charAt(i + 1) == 'L') {
                    num = num + L - X;
                    i++;
                } else if (i + 1 < n && s.charAt(i + 1) == 'C') {
                    num = num + C - X;
                    i++;
                } else {
                    num = num + X;
                }
            } else if (s.charAt(i) == 'L') {
                num = num + L;
            } else if (s.charAt(i) == 'C') {
                if (i + 1 < n && s.charAt(i + 1) == 'D') {
                    num = num + D - C;
                    i++;
                } else if (i + 1 < n && s.charAt(i + 1) == 'M') {
                    num = num + M - C;
                    i++;
                } else {
                    num = num + C;
                }
            } else if (s.charAt(i) == 'D') {
                num = num + D;
            } else if (s.charAt(i) == 'M') {
                num = num + M;
            }
        }
        return num;
    }
}
