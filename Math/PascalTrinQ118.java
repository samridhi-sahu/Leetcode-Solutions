<<<<<<< HEAD
// 118. Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/description/

import java.util.ArrayList;
import java.util.List;

public class PascalTrinQ118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            int coff = 1;
            for (int j = 1; j <= i; j++) {
                temp.add(coff);
                coff = coff * (i - j) / j;
            }
            list.add(temp);
        }
        return list;
    }
}
=======
// 118. Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/description/

import java.util.ArrayList;
import java.util.List;

public class PascalTrinQ118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            int coff = 1;
            for (int j = 1; j <= i; j++) {
                temp.add(coff);
                coff = coff * (i - j) / j;
            }
            list.add(temp);
        }
        return list;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
