class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] arr = new boolean[n][m] ;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    dfs(grid,i,j,2,arr);
                }
            }
        }
        int max = 2 ;
        for(int[] i : grid){
            for(int j : i){
                if(j == 1){
                    return -1 ;
                }
                max = Math.max(max , j) ;
            }
        }
        return max-2;
    }
    public void dfs(int grid[][],int i,int j,int min,boolean[][] arr){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length ){
            return ;
        } 
        if(grid[i][j] != 1 && grid[i][j] < min){
            return ;
        }
        grid[i][j] = min;
        arr[i][j] = true; 
        dfs(grid,i-1,j,min+1,arr);
        dfs(grid,i+1,j,min+1,arr);
        dfs(grid,i,j-1,min+1,arr);
        dfs(grid,i,j+1,min+1,arr);
    }
}