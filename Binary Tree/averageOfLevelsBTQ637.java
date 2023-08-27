// 637. Average of Levels in Binary Tree
// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class averageOfLevelsBTQ637 {
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null)
            return new ArrayList<Double>();
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        Double sum = 0.0;
        int n = 0;
        while (!que.isEmpty()) {
            TreeNode temp = que.poll();
            if (temp == null) {
                list.add(sum / n);
                sum = 0.0;
                n = 0;
                if (!que.isEmpty())
                    que.add(null);
            } else {
                sum += temp.val;
                n++;
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }
        }
        return list;
    }
}
