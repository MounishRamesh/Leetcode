class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;
        int count = 0 ;
        boolean[][] arr = new boolean[m][n] ;
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ;j  ++){
                if(!arr[i][j] && grid[i][j] == '1'){
                    dfs(grid , arr , i , j) ;
                    count ++ ;
                }
            }
        }
        return count ;
    }
    public static void dfs(char[][] arr , boolean[][] vis , int i , int j){
        // System.out.println(i + " " + j) ;
        if(i < 0 || i > arr.length-1 || j < 0 || j > arr[0].length-1){
            return ;
        }
        if(vis[i][j] || arr[i][j] == '0'){
            return ;
        }
        System.out.println(i + " " + j) ;
        vis[i][j] = true ;
        dfs(arr , vis , i+1 , j) ;
        dfs(arr , vis , i-1 , j) ;
        dfs(arr , vis , i , j+1) ;
        dfs(arr , vis , i , j-1) ;
    }
}