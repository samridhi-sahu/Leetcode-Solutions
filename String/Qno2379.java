// 2379. Minimum Recolors to Get K Consecutive Black Blocks
public class Qno2379 {
    public int minimumRecolors(String blocks, int k) {
        int min = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W')
                count++;
        }
        min = count;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W')
                count++;
            if (blocks.charAt(i - k) == 'W')
                count--;
            if (min >= count)
                min = count;
        }
        return min;
    }
}
