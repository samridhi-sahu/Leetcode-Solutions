// 1456. Maximum Number of Vowels in a Substring of Given Length
public class Qno1456 {
    public int maxVowels(String s, int k) {
        int max = 0;

        // tc is n2 naive method

        // for(int i=0;i<=s.length()-k;i++){
        // String sub = s.substring(i, i+k);
        // int count=0;
        // for(int j=0;j<k;j++){
        // if(sub.charAt(j)=='a' || sub.charAt(j)=='e' || sub.charAt(j)=='i' ||
        // sub.charAt(j)=='o' || sub.charAt(j)=='u') count++;
        // }
        // if(max<=count) max=count;
        // }

        // tc is n sliding window method

        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (set.contains(s.charAt(i)))
                count++;
        }
        max = count;
        for (int i = k; i < s.length(); i++) {
            if (set.contains(s.charAt(i)))
                count++;
            if (set.contains(s.charAt(i - k)))
                count--;
            if (max <= count)
                max = count;
        }
        return max;
    }
}
