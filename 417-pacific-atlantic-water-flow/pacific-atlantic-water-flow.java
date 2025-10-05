class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length ;
        int n = heights[0].length ;
        boolean[][] arr = new boolean[m][n] ;
        boolean[][] arr1 = new boolean[m][n] ;
        for(int i = 0 ; i < m ; i ++){
            dfs(heights, i , 0 , arr , heights[i][0]) ;
            dfs(heights, i , n-1 , arr1 , heights[i][n-1]) ;
        }
        for(int i = 0 ; i < n ; i ++){
            dfs(heights , 0 , i , arr , heights[0][i]) ;
            dfs(heights , m-1 , i , arr1 , heights[m-1][i]) ;
        }
        List<List<Integer>> ls = new ArrayList<>() ;
        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = 0 ; j < arr[0].length ; j ++){
                if(arr[i][j] && arr1[i][j]){
                    List<Integer> ls1 = new ArrayList<>() ;
                    ls1.add(i) ;
                    ls1.add(j) ;
                    ls.add(ls1) ;
                }
            }
            System.out.println() ;
        }
        return ls ;
    }
    public static void dfs(int[][] arr , int i , int j , boolean[][] vis , int pre){
        if(i < 0 || i >= arr.length|| j < 0 || j >= arr[0].length){
            return ;
        }
        if(vis[i][j]){
            return ;
        }
        if(arr[i][j] < pre){
            return ;
        }
        vis[i][j] = true ;
        dfs(arr , i+1 , j , vis , arr[i][j]) ;
        dfs(arr , i-1, j , vis , arr[i][j]) ;
        dfs(arr , i , j+1 , vis , arr[i][j]) ;
        dfs(arr , i , j-1 , vis , arr[i][j]) ;
    }
}