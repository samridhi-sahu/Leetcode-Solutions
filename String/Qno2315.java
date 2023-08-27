<<<<<<< HEAD
// 2315. Count Asterisks
public class Qno2315 {
    public int countAsterisks(String s) {
        // n2 solution

        // String[] arr = s.split("[|]");
        // int count=0;
        // for(int i=0;i<arr.length;i=i+2){
        // for(int j=0;j<arr[i].length();j++){
        // if(arr[i].charAt(j)=='*') count++;
        // }
        // }
        // return count;

        // n solution
        int bar = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (bar % 2 == 0 && s.charAt(i) == '*')
                count++;
            else if (s.charAt(i) == '|')
                bar += 1;
        }
        return count;
    }
}
=======
// 2315. Count Asterisks
public class Qno2315 {
    public int countAsterisks(String s) {
        // n2 solution

        // String[] arr = s.split("[|]");
        // int count=0;
        // for(int i=0;i<arr.length;i=i+2){
        // for(int j=0;j<arr[i].length();j++){
        // if(arr[i].charAt(j)=='*') count++;
        // }
        // }
        // return count;

        // n solution
        int bar = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (bar % 2 == 0 && s.charAt(i) == '*')
                count++;
            else if (s.charAt(i) == '|')
                bar += 1;
        }
        return count;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
