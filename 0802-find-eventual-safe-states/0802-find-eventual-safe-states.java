class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int vis[] = new int[graph.length];
        int path[] = new int[graph.length];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(!isCycle(i,adj,vis,path)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean isCycle(int node,ArrayList<ArrayList<Integer>> adj,int vis[],int path[]){
        vis[node]=1;
        path[node]=1;
        for(int it:adj.get(node)){
            if(vis[it]==0){
                if(isCycle(it,adj,vis,path)) return true;
            }
            else if(path[it]==1) return true;
        }
        path[node]=0;
        return false;
    }
}