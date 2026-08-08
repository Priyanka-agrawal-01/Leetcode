class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return list;
        int level =0;
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                TreeNode curr = q.poll();
                if(i==0) list.add(curr.val);
           
                if(curr.right!= null) {
                    q.add(curr.right);
                }
                if(curr.left!= null){
                    q.add(curr.left);
                }
            }
        }
        return list;
    }
}