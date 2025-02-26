class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int column = mat[0].length;

        if(column*row!=r*c){
            return mat;
        }

        int row_index = 0; 
        int col_index = 0;

        int[][] res = new int[r][c];
        for(int i =0 ; i < row; i++){
            for(int j = 0; j < column; j++){
                res[row_index][col_index]=mat[i][j];
                col_index++;
                if(col_index == c){
                    col_index=0;
                    row_index++;
                }
            }
        }
        
        return res;
    }
}