public class AddStringq415 {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        String s = "";
        while (i >= 0 && j >= 0) {
            int a = num1.charAt(i) - '0';
            int b = num2.charAt(j) - '0';
            s = ((a + b + carry) % 10) + s;
            carry = (a + b + carry) / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            int a = num1.charAt(i) - '0';
            s = ((a + carry) % 10) + s;
            carry = (a + carry) / 10;
            i--;
        }
        while (j >= 0) {
            int b = num2.charAt(j) - '0';
            s = ((b + carry) % 10) + s;
            carry = (b + carry) / 10;
            j--;
        }
        if (carry != 0)
            return carry + s;
        return s;
    }
}
