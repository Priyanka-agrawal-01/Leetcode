class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    zero(matrix,i,j);
                }
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==77629){
                    matrix[i][j]=0;
                }
            }
        }

    }
    public void zero(int[][] matrix , int a , int b){
        for(int j = 0; j < matrix[a].length; j++) {
            if(matrix[a][j] != 0) {
                matrix[a][j] = 77629;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][b] != 0) {
                matrix[i][b] = 77629;
            }
        }
    }
}