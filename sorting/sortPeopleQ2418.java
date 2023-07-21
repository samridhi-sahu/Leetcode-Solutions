// 2418. Sort the People
// https://leetcode.com/problems/sort-the-people/description/
public class sortPeopleQ2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        int start = 0, end = (heights.length) - 1;
        sort(names, heights, start, end);
        return names;
    }

    void sort(String[] names, int[] heights, int start, int end) {
        if (start < end) {
            int k = partition(names, heights, start, end);
            sort(names, heights, start, k - 1);
            sort(names, heights, k + 1, end);
        }
    }

    int partition(String[] names, int[] heights, int start, int end) {
        int pivot = heights[end];
        int i = start - 1;
        int j = start;
        while (j < end) {
            if (heights[j] >= pivot) {
                i++;
                int temp1 = heights[i];
                heights[i] = heights[j];
                heights[j] = temp1;
                String temp2 = names[i];
                names[i] = names[j];
                names[j] = temp2;
            }
            j++;
        }
        int temp1 = heights[i + 1];
        heights[i + 1] = heights[end];
        heights[end] = temp1;
        String temp2 = names[i + 1];
        names[i + 1] = names[end];
        names[end] = temp2;
        return i + 1;
    }
}
