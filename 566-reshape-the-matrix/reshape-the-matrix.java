class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c]; 
        boolean val = false ;
        int len = mat.length * mat[0].length ;
        int nr = 0 ;
        int nc = 0;
        if(len == r * c){
            for(int i =0  ;i < mat.length; i ++){
                for(int j = 0; j < mat[0].length ;j ++){
                    arr[nr][nc] = mat[i][j]; 
                    nc ++ ;
                    if(nc == c){
                        nr ++ ;
                        nc = 0 ;
                    }
                    val = true ;
                }
            }
            return arr ;
        }
        return mat ;
    }
}