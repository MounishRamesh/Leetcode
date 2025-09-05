class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        int i = 0 ;
        int j = m*n-1 ;
        while(i <= j){
            int mid = i+(j-i)/2 ;
            int val = matrix[mid/n][mid%n] ;
            System.out.println(mid/n + " " + mid%n + " " + val) ;
            if(val == target){
                return true ;
            }
            else if(val < target){
                i = mid + 1 ;
            }
            else{
                j = mid-1 ;
            }
        }
        for(int[] i1 : matrix){
            for(int j1 : i1){
                if(j1 == target){
                    return true ;
                }
            }
        }
        return false ;
    }
}