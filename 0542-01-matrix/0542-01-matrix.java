class Solution {
    public class Node{
        int first;
        int second;
        int third;
        Node(int _first, int _second, int _third) {
            this.first = _first;
            this.second = _second;
            this.third = _third;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        Queue<Node> q = new LinkedList<Node>();
        int m = mat.length;
        int n= mat[0].length;
        int vis[][] = new int[m][n];
        int dist[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new Node(i,j,0));
                    vis[i][j]=1;
                }
            }
        }
        int [] delrow = {-1,0,+1,0};
        int [] delcol = {0,+1,0,-1};

        while(!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            int steps = q.peek().third;
            q.remove();
            dist[row][col] = steps;
            for(int i=0;i<4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];

                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && vis[nrow] [ncol] == 0) {
                    vis[nrow][ncol] =1;
                    q.add(new Node(nrow, ncol, steps+1));
                }
            }
        }
        return dist;
    }
}