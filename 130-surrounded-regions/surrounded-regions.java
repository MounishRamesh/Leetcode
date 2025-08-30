class Solution {
    public void solve(char[][] board) {
        int m = board.length ;
        int n = board[0].length ;
        boolean[][] arr = new boolean[m][n] ;
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ;j ++){
                if(i == 0 || j == 0 || i == m-1 || j == n-1){
                    if(board[i][j] == 'O'){
                        dfs(board , arr , i , j) ;
                    }
                }
            }
        }
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if(!arr[i][j]){
                    board[i][j] = 'X' ;
                }
            }
        }
    }
    public static void dfs(char[][] arr , boolean[][] arr1 , int i , int j){
        // arr1[i][j] = true ;
        if(i < 0 || j < 0 || i > arr.length-1 || j > arr[0].length-1){
            return ;
        }
        // arr1[i][j] = true ;
        if(arr1[i][j] || arr[i][j] == 'X'){
            return ;
        }
        arr1[i][j] = true ;
        dfs(arr , arr1 , i+1 , j) ;
        dfs(arr , arr1 , i-1 , j) ;
        dfs(arr , arr1 , i , j+1) ;
        dfs(arr , arr1 , i , j-1) ;
    }
}