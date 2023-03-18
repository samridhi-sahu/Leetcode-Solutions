// 1859. Sorting the Sentence

public class Qno1859 {
    public String sortSentence(String s) {
        String[] a = s.split(" ");
        int l = a.length;
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < l; i++) {
                int l1 = a[i].length();
                int n = a[i].charAt(l1 - 1) - '0';
                String temp = a[i];
                a[i] = a[n - 1];
                a[n - 1] = temp;
            }
        }
        String str = a[0].substring(0, a[0].length() - 1) + " ";
        for (int i = 1; i < l; i++) {
            str += a[i].substring(0, a[i].length() - 1) + " ";
        }
        return str.trim();
    }
}
