class Solution {
    public boolean isBipartite(int[][] graph) {
        int vis[] =new int[graph.length];
        int colour[] = new int[graph.length];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        boolean ans=true;
        for(int i=0;i<graph.length;i++){
            if(ans==false){
                return false;
            }
            ans=dfs(i,adj,vis,colour);
        }
        return ans;
    }
    public boolean dfs(int node,ArrayList<ArrayList<Integer>>  adj , int[] vis,int[]colour){
        vis[node]=1;
        for(int it:adj.get(node)){
            if(vis[it]==0){
                colour[it]=1-colour[node];
                if(dfs(it,adj,vis,colour)==false) return false;
            }
            else if(colour[node]==colour[it]){
                return false;
            } 
        }
    return true;
    }
}