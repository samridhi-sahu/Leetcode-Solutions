// 1502. Can Make Arithmetic Progression From Sequence
// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/

import java.util.Arrays;

public class AP_Q1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 2)
            return true;
        // tc n2 bubble sort
        // for(int i=0;i<arr.length-1;i++){
        // for(int j=i+1;j<arr.length;j++){
        // if(arr[i]>arr[j]){
        // int temp=arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }
        // tc nlogn quicksort
        Arrays.sort(arr);
        int flag = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != flag)
                return false;
        }
        return true;
    }
}
