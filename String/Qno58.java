// 58. Length of Last Word
public class Qno58 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }
}
