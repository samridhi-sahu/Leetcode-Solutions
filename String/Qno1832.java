<<<<<<< HEAD
// 1832. Check if the Sentence Is Pangram
public class Qno1832 {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] present = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                present[sentence.charAt(i) - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (present[i] == false) {
                return false;
            }
        }
        return true;
    }
}
=======
// 1832. Check if the Sentence Is Pangram
public class Qno1832 {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] present = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                present[sentence.charAt(i) - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (present[i] == false) {
                return false;
            }
        }
        return true;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
