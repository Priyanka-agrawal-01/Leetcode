
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int level =0;
        traverse(root,list,level);
        return list;
    }
    public void traverse(TreeNode root , List<Integer> list ,int level){
        if(root == null) return;
        if(list.size()==level){
            list.add(root.val);
        }
        if(root.right!=null){
            traverse(root.right,list,level+1);
        }
        if(root.left!=null){
            traverse(root.left,list,level+1);
        }

    }
}