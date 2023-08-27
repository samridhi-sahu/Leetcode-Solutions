// https://leetcode.com/problems/same-tree/description/
// 100. Same Tree

public class SameTreeQ100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p != null && q == null)
            return false;
        else if (p == null && q != null)
            return false;
        else {
            boolean l = isSameTree(p.left, q.left);
            boolean r = isSameTree(p.right, q.right);
            boolean value = p.val == q.val;
            if (l && r && value)
                return true;
            return false;
        }
    }
}
