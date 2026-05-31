class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
        int count = height(root.left) + height(root.right);
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        if(root.left!=null) count++;
        if(root.right!=null) count++;
        return Math.max(count,Math.max(left,right));
    }
    public int height(TreeNode n){
        if(n==null || (n.left==null && n.right==null)) return 0;
        return 1 + Math.max(height(n.left),height(n.right));
    }
}