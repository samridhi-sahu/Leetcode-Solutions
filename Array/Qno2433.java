<<<<<<< HEAD
// 2433. Find The Original Array of Prefix Xor
public class Qno2433 {
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i - 1] ^ pref[i];
        }
        return arr;
    }
}
=======
// 2433. Find The Original Array of Prefix Xor
public class Qno2433 {
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i - 1] ^ pref[i];
        }
        return arr;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
