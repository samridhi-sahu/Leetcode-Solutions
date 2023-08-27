// 2037. Minimum Number of Moves to Seat Everyone
// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/

public class Q2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        int count = 0;
        // quick sort
        sort(0, seats.length - 1, seats);
        sort(0, students.length - 1, students);
        for (int i = 0; i < seats.length; i++) {
            count += Math.abs(seats[i] - students[i]);
        }
        return count;
    }

    void sort(int start, int end, int[] arr) {
        if (start < end) {
            int k = partition(arr, start, end);
            sort(start, k - 1, arr);
            sort(k + 1, end, arr);
        }
    }

    int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        int j = start;
        while (j < end) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }
}
