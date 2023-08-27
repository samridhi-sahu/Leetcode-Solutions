<<<<<<< HEAD
// 2085. Count Common Words With One Occurrence
class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        int i = 0, j = 0;
        for (i = 0; i < words1.length; i++) {
            int temp = 0;
            for (j = 0; j < words1.length; j++) {
                if (i != j && words1[i].equals(words1[j]))
                    break;
            }
            if (j == words1.length) {
                for (j = 0; j < words2.length; j++) {
                    if (words1[i].equals(words2[j]))
                        temp++;
                }
            }
            if (temp == 1)
                count++;
        }
        return count;
    }
=======
// 2085. Count Common Words With One Occurrence
class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        int i = 0, j = 0;
        for (i = 0; i < words1.length; i++) {
            int temp = 0;
            for (j = 0; j < words1.length; j++) {
                if (i != j && words1[i].equals(words1[j]))
                    break;
            }
            if (j == words1.length) {
                for (j = 0; j < words2.length; j++) {
                    if (words1[i].equals(words2[j]))
                        temp++;
                }
            }
            if (temp == 1)
                count++;
        }
        return count;
    }
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
}