class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
        int[] indegree = new int[numCourses];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++){
            int course = pre[i][0];
            int prer = pre[i][1];
            adj.get(prer).add(course);
            indegree[course]++;
        }
        Queue<Integer> q =new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int ans[]= new int[numCourses];
        int i=0;
        while(!q.isEmpty()){
            int count =q.remove();
            indegree[count]--;
            ans[i]=count;
            i++;
            for(int it:adj.get(count)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        if(i != numCourses) {
            return new int[0];
        }
        return ans;
    }
}