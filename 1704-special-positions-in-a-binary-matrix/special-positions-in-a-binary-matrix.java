class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0 ;
        int m = mat.length ;
        int n = mat[0].length ;
        for(int i =0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if(mat[i][j] == 1){
                    if(check(i , j , mat)){
                        count ++ ;
                    }
                }
            }
        }
        return count ;
    }
    public static boolean check(int i , int j , int[][] arr){
        for(int k = 0 ; k < arr.length ; k ++){
            // System.out.print(k+" " + i + " ") ;
            if(arr[k][j] == 1 && k != i){
                return false ;
            }
        }
        // System.out.println() ;
        for(int k = 0 ; k < arr[0].length ; k ++){
            // System.out.print(k+" " + j+ " ") ;
            if(arr[i][k] == 1 && k != j){
                // System.out.print(k+" " + j+ " ") ;
                return false ;
            }
        }
        return true ;
    }
}