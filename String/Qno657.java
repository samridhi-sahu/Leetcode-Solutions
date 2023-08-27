<<<<<<< HEAD
// 657. Robot Return to Origin
public class Qno657 {
    public boolean judgeCircle(String moves) {
        int L = 0;
        int R = 0;
        int U = 0;
        int D = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L')
                L++;
            if (moves.charAt(i) == 'R')
                R++;
            if (moves.charAt(i) == 'U')
                U++;
            if (moves.charAt(i) == 'D')
                D++;
        }
        if (L == R && U == D)
            return true;
        return false;
    }
}
=======
// 657. Robot Return to Origin
public class Qno657 {
    public boolean judgeCircle(String moves) {
        int L = 0;
        int R = 0;
        int U = 0;
        int D = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L')
                L++;
            if (moves.charAt(i) == 'R')
                R++;
            if (moves.charAt(i) == 'U')
                U++;
            if (moves.charAt(i) == 'D')
                D++;
        }
        if (L == R && U == D)
            return true;
        return false;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
