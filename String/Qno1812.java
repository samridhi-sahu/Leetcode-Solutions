<<<<<<< HEAD
// 1812. Determine Color of a Chessboard Square
public class Qno1812 {
    public boolean squareIsWhite(String coordinates) {
        if (((int) 'h' - (int) coordinates.charAt(0)) % 2 == 0) {
            if ((coordinates.charAt(1) - '0') % 2 == 0)
                return false;
            else
                return true;
        } else {
            if ((coordinates.charAt(1) - '0') % 2 == 0)
                return true;
            else
                return false;
        }
    }
}
=======
// 1812. Determine Color of a Chessboard Square
public class Qno1812 {
    public boolean squareIsWhite(String coordinates) {
        if (((int) 'h' - (int) coordinates.charAt(0)) % 2 == 0) {
            if ((coordinates.charAt(1) - '0') % 2 == 0)
                return false;
            else
                return true;
        } else {
            if ((coordinates.charAt(1) - '0') % 2 == 0)
                return true;
            else
                return false;
        }
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
