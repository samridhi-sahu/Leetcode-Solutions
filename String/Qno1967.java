<<<<<<< HEAD
// 1967. Number of Strings That Appear as Substrings in Word
public class Qno1967 {
    class Solution {
        public int numOfStrings(String[] patterns, String word) {
            int count = 0;
            for (int i = 0; i < patterns.length; i++) {
                if (word.contains(patterns[i])) {
                    count++;
                }
            }
            return count;
        }
    }
}
=======
// 1967. Number of Strings That Appear as Substrings in Word
public class Qno1967 {
    class Solution {
        public int numOfStrings(String[] patterns, String word) {
            int count = 0;
            for (int i = 0; i < patterns.length; i++) {
                if (word.contains(patterns[i])) {
                    count++;
                }
            }
            return count;
        }
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
