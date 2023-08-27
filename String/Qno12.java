// 12. Integer to Roman
//https://leetcode.com/problems/integer-to-roman/description/

public class Qno12 {
    public String intToRoman(int num) {
        String[] o = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] t = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] h = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] th = { "", "M", "MM", "MMM" };
        return th[num / 1000] + h[num % 1000 / 100] + t[num % 100 / 10] + o[num % 10 / 1];
    }
}
