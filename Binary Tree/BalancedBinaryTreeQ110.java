// 110. Balanced Binary Tree
// https://leetcode.com/problems/balanced-binary-tree/description/ 
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        boolean l = isBalanced(root.left);
        boolean r = isBalanced(root.right);
        boolean d = Math.abs(height(root.left) - height(root.right)) > 1 ? false : true;
        if (l && r && d)
            return true;
        return false;
    }

    int height(TreeNode root) {
        if (root == null)
            return 0;
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l, r) + 1;
    }
}
