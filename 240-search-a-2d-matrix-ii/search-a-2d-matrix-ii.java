class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0 ;
        int j = matrix[0].length-1 ;
        while(i < matrix.length && j >= 0){
            int val = matrix[i][j] ;
            if(val == target){
                return true ;
            }   
            else if(val > target){
                j -- ;
            }
            else{
                i ++ ;
            }
        }
        return false ;
    }
}