class Solution {
    static int count = 0 ;
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0 ;
        boolean[][] arr = new boolean[grid.length][grid[0].length] ;
        for(int i = 0 ;i < grid.length ;i ++){
            for(int j = 0 ;j < grid[0].length ;j ++){
                if(grid[i][j] == 1 && !arr[i][j]){
                    valid(grid , arr , i , j) ;
                    System.out.println(count) ;
                    // count = 0 ;
                    max = Math.max(count , max) ;
                    count = 0 ;
                }
            }
        }
        return max ;
    }
    public static void valid(int[][]grid , boolean[][] arr , int i , int j){
        if(i <0 || i >arr.length-1 || j < 0 || j > arr[0].length-1){
            return ; 
        }
        if(grid[i][j] == 0 || arr[i][j]){
            return ;
        }
        arr[i][j] = true ;
        count ++ ;
        valid(grid , arr , i+1 , j) ;
        valid(grid , arr , i , j+1) ;
        valid(grid , arr , i-1 , j) ;
        valid(grid , arr , i , j-1) ;
    }
}