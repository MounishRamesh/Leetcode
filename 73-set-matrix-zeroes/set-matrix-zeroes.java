class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        boolean[][] arr1 = new boolean[matrix.length][matrix[0].length] ;
        for(int i = 0 ;i < m ; i++){
            for(int j = 0 ; j < n ;j ++){
                if(matrix[i][j] == 0){
                    arr1[i][j] = true ;
                }
            }
        }
        for(int i = 0 ;i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if(matrix[i][j] == 0 && arr1[i][j]){
                    dfs(matrix , i , j , arr1) ;
                }
            }
        }
    }
    public static void dfs(int[][] arr , int i , int j , boolean[][] arr1){

        for(int k = 0 ; k < arr[0].length ; k ++){
            if(!arr1[i][k]){
                arr[i][k] = 0 ;
            }
        }
        for(int k = 0 ; k < arr.length ;k ++){
            
            // arr[k][j] = 0 ;
            if(!arr1[k][j]){
                arr[k][j] = 0 ;
            }
        }
    }
}