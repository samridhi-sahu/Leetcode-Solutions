class Solution {
    public int bestClosingTime(String customers) {

        int n = customers.length();

        // time complexity is n2 gives run time error in worst case

        // int time = 0;
        // int min = 0;
        // for(int j=0;j<=n;j++){
        // int penalty = 0;
        // for(int i=j;i<n;i++){
        // if(customers.charAt(i)=='Y') penalty++;
        // }
        // for(int i=0;i<j;i++){
        // if(customers.charAt(i)=='N') penalty++;
        // }
        // if(j==0) min = penalty;
        // else if(min>penalty){
        // min = penalty;
        // time = j;
        // }
        // }
        // return time;

        // optimized method prefix sum, time complexity n

        int[] arr = new int[n + 1];
        int countN = 0;
        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'N')
                countN++;
        }
        arr[n] = countN;
        for (int i = n - 1; i >= 0; i--) {
            if (customers.charAt(i) == 'Y')
                arr[i] = arr[i + 1] + 1;
            else
                arr[i] = arr[i + 1] - 1;
        }
        int time = 0;
        int minPenalty = arr[0];
        for (int i = 1; i < n + 1; i++) {
            if (minPenalty > arr[i]) {
                minPenalty = arr[i];
                time = i;
            }
        }
        return time;
    }
}