class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        int[][] arr ;
        int l = 0 ;
        int r = (m*n)-1 ;
        // if(m == 1 && n ==1 ){
        //     if(matrix[0][0] == target){
        //         return true ;
        //     }
        //     else{
        //         return false ;
        //     }
        // }
        while(l <= r){
            int mid = (l)+(r-l)/2 ;
            int val = matrix[mid/n][mid%n]; 
            System.out.println(mid + " " + val + " " + l + " " + r); 
            if(val == target){
                return true ;
            }
            if(val < target){
                l = mid+1 ;
            }
            else{
                r = mid-1 ;
            }
        }
        return false ;
    }
}