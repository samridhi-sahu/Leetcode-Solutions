<<<<<<< HEAD
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
=======
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
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
