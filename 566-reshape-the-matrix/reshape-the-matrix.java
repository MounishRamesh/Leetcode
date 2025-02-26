class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int column = mat[0].length;

        if(column*row!=r*c){
            return mat;
        }

        int nc = 0; 
        int nr = 0;

        int[][] res = new int[r][c];
        for(int i =0 ; i < row; i++){
            for(int j = 0; j < column; j++){
                res[nr][nc]=mat[i][j];
                nc++;
                if(nc == c){
                    nc=0;
                    nr ++;
                }
            }
        }
        
        return res;
    }
}