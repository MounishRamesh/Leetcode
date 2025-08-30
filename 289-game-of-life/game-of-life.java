class Solution {

    public void gameOfLife(int[][] board) {
        int m = board.length ;
        int n = board[0].length ;
        int[][] arr = new int[m][n] ;
        for(int i = 0 ; i < m ;i ++){
            for(int j = 0 ; j < n ;j ++){
                int count1 = dfs(board , i , j) ;
                if(board[i][j] == 1){
                    System.out.println(i + " " + j + " " + count1) ;
                    if(count1 <2 || count1 > 3){
                        arr[i][j] = 0 ;
                    }
                    else{
                        arr[i][j] = 1 ;
                    }
                }
                else{
                    System.out.println(i + " " + j + " " + count1) ;
                    if(count1 == 3){
                        arr[i][j] = 1 ;
                    }
                    else{
                        arr[i][j] = 0 ;
                    }
                }
            }
        }
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                board[i][j] = arr[i][j] ;
            }
        }
    }
    public static int dfs(int[][] arr , int i , int j ){
        int count = 0 ;
        if(i+1 < arr.length && arr[i+1][j] == 1){
            count ++ ;
        }
        if(i-1 >= 0 && arr[i-1][j] == 1){
            count ++ ;
        }
        if(j+1 < arr[0].length && arr[i][j+1] == 1){
            count ++ ;
        }
        if(j-1 >= 0 && arr[i][j-1] == 1){
            count ++ ;
        }
        if(i+1 < arr.length && j+1 < arr[0].length && arr[i+1][j+1] == 1){
            count ++ ;
        }
        if(i-1 >= 0 && j-1 >= 0 && arr[i-1][j-1] == 1){
            
            count ++ ;
        }
        if(i+1 < arr.length && j-1 >= 0 && arr[i+1][j-1] == 1){
            count ++ ;
        }
        if(i-1 >= 0 && j+1 < arr[0].length &&  arr[i-1][j+1] == 1){
            count ++ ;
        }
        return count ;
    }
    
}