// 111. Minimum Depth of Binary Tree
// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

public class MinDepthOfBinaryTreeQ111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (l != 0 && r != 0)
            return Math.min(l, r) + 1;
        return Math.max(l, r) + 1;
    }
}
