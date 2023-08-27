// 102. Binary Tree Level Order Traversal
// https://leetcode.com/problems/binary-tree-level-order-traversal/description/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalQ102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<List<Integer>>();
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> subList = new ArrayList<Integer>();
        que.add(root);
        que.add(null);
        while (!que.isEmpty()) {
            TreeNode temp = que.poll();
            if (temp == null) {
                list.add(subList);
                subList = new ArrayList<Integer>();
                if (!que.isEmpty())
                    que.add(null);
            } else {
                subList.add(temp.val);
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }
        }
        return list;
    }
}
