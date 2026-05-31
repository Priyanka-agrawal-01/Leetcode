class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left =height(root.left);
        if(root.left!=null) left++;
        int right = height(root.right);
        if(root.right!=null) right++;
        if(Math.abs(left-right)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode n){
        if(n==null|| (n.left==null&&n.right==null)) return 0;
        return Math.max(height(n.left),height(n.right)) + 1;
    }
}