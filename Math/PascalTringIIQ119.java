
// 119. Pascal's Triangle II
// https://leetcode.com/problems/pascals-triangle-ii/description/
import java.util.ArrayList;
import java.util.List;

public class PascalTringIIQ119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        long coff = 1;
        rowIndex++;
        for (int j = 1; j <= rowIndex; j++) {
            list.add((int) coff);
            coff = coff * (rowIndex - j) / j;
        }
        return list;
    }
}
