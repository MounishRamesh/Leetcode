class Solution {
    static int ind = 0 ;
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ;  i< board.length ; i ++){
            for(int j = 0 ; j < board[0].length ; j ++){
                boolean[][] arr = new boolean[board.length][board[0].length]; 
                if(board[i][j] == word.charAt(0)) {
                    if(dfs(board , arr , i , j , ind , word)){
                        return true ;
                    }
                }
            }
        }
        return false ;
    }
    public static boolean dfs(char[][] arr , boolean[][] vis , int i , int j , int ind , String w){
        if(i < 0 || j < 0 || i > arr.length-1 || j > arr[0].length-1 || ind > w.length()-1 || vis[i][j]){
            return false; 
        }
        if(w.charAt(ind) != arr[i][j]){
            return false ;
        }
        if(w.length()-1 == ind){
            return true; 
        }
        
        vis[i][j] = true ;
        boolean ans = dfs(arr , vis , i+1 , j , ind+1 , w) || dfs(arr , vis , i-1 , j , ind+1 , w) || dfs(arr , vis , i , j+1 , ind+1 , w) ||dfs(arr , vis , i , j-1 , ind+1 , w) ;
        vis[i][j] = false ;
        return ans; 
    }
}