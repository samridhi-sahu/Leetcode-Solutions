// 50. Pow(x, n)
// https://leetcode.com/problems/powx-n/description/

public class Powq50 {
    public double myPow(double x, int n) {
        // tc n - tle

        // int i=1;
        // double power=1;
        // while(i<=Math.abs(n)){
        // power = power*x;
        // i++;
        // }
        // if(n<0) return 1/power;
        // return power;

        // by d&c
        double temp;
        if (n == 0)
            return 1;
        temp = myPow(x, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        else {
            if (n > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }
}
