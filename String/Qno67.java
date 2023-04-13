import java.math.BigInteger;

public class Qno67 {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        String str = sum.toString(2);
        return str;
    }
}
