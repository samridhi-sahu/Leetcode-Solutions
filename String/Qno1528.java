<<<<<<< HEAD
// 1528. Shuffle String

import java.util.*;

public class Qno1528 {
    public String restoreString(String s, int[] indices) {
        int len = indices.length;
        char[] arr = new char[len];
        for (int i = 0; i < len; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        String str = String.valueOf(arr);
        return str;
    }

}
=======
// 1528. Shuffle String

import java.util.*;

public class Qno1528 {
    public String restoreString(String s, int[] indices) {
        int len = indices.length;
        char[] arr = new char[len];
        for (int i = 0; i < len; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        String str = String.valueOf(arr);
        return str;
    }

}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
