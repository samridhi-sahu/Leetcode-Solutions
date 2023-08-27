<<<<<<< HEAD
// 1678. Goal Parser Interpretation

public class Qno1678 {
    class Solution {
        public String interpret(String command) {
            String str = "";
            for (int i = 0; i < command.length(); i++) {
                if (command.charAt(i) == 'G')
                    str += 'G';
                if (command.charAt(i) == '(' && command.charAt(i + 1) == ')')
                    str += 'o';
                if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a')
                    str += "al";
            }
            return str;
        }
    }
}
=======
// 1678. Goal Parser Interpretation

public class Qno1678 {
    class Solution {
        public String interpret(String command) {
            String str = "";
            for (int i = 0; i < command.length(); i++) {
                if (command.charAt(i) == 'G')
                    str += 'G';
                if (command.charAt(i) == '(' && command.charAt(i + 1) == ')')
                    str += 'o';
                if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a')
                    str += "al";
            }
            return str;
        }
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
