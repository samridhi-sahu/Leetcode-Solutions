// 543. Diameter of Binary Tree
class diameterOfBinaryTreeQ543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int dl = diameterOfBinaryTree(root.left);
        int dr = diameterOfBinaryTree(root.right);
        int h = height(root.left) + height(root.right);
        return Math.max(h, Math.max(dl, dr));
    }

    int height(TreeNode root) {
        if (root == null)
            return 0;
        int hl = height(root.left);
        int hr = height(root.right);
        return Math.max(hl, hr) + 1;
    }
}