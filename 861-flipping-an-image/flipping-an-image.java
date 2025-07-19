class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length ;
        int[][] arr = new int[n][n] ;
        for(int i = 0 ;i < n ;i ++){
            int k = image.length ;
            for(int j = 0 ; j< n ;j ++){
                int val = image[i][k-1] ;
                if(val == 0){
                    arr[i][j] = 1 ;
                }
                else{
                    arr[i][j] = 0 ;
                }
                //arr[i][j] = image[i][k-1] ;
                //System.out.print(arr[i][j]+" ") ;
                k -- ;
            }
            //System.out.println() ;
        }
        return arr ;
    }
}