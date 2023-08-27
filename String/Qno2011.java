// 2011. Final Value of Variable After Performing Operations
public class Qno2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            String str = operations[i];
            if (str.charAt(1) == '-') {
                x = x - 1;
            }
            if (str.charAt(1) == '+') {
                x = x + 1;
            }
        }
        return x;
    }
}
