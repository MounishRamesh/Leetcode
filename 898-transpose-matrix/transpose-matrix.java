class Solution {
    public int[][] transpose(int[][] matrix) {
        int a = matrix.length ;
        int b = matrix[0].length ;
        int[][] arr2 = new int[b][a] ;
        for(int i = 0 ;i < a; i ++){
            for(int j = 0 ; j < b ; j++){
                arr2[j][i] = matrix[i][j] ;
            }
        }
        return arr2 ;
    }
}