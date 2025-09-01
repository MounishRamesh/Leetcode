class Solution {
    public int[][] findFarmland(int[][] land) {
        int m = land.length ;
        int n = land[0].length ;
        boolean[][] arr = new boolean[m][n] ;
        List<int[]> ls = new ArrayList<>() ;
        for(int i = 0 ; i < m ;i ++){
            for(int j = 0 ; j < n ; j ++){
                if(land[i][j] == 1 && !arr[i][j]){
                    int[] ls1 = {Integer.MAX_VALUE,Integer.MAX_VALUE , 0 ,0} ;
                    dfs(land , arr , i , j , ls1); 
                    ls.add(ls1) ;
                }
            }
        }
        int[][] ans ;
        if(ls.isEmpty()){
            ans = new int[0][0] ;
        }
        else{
           ans = new int[ls.size()][ls.get(0).length] ;
        }
        for(int i = 0 ; i < ans.length ;i ++){
            int[] a = ls.get(i) ;
            for(int j = 0 ; j < ans[0].length ; j ++){
                ans[i][j] = a[j] ;
            }
        }
        return ans ;
    }
    public static void dfs(int[][] arr , boolean[][] vis , int i  , int j, int[] ls1){
        if(i < 0 || i > arr.length-1 || j < 0 | j > arr[0].length-1){
            return ;
        }
        if(arr[i][j] == 0 || vis[i][j]){
            return ;
        }
        vis[i][j] = true ;
        ls1[0] = Math.min(ls1[0] , i); 
        ls1[1] = Math.min(ls1[1] , j) ;
        ls1[2] = Math.max(ls1[2] , i) ;
        ls1[3] = Math.max(ls1[3] , j) ;
        dfs(arr , vis , i  , j-1 , ls1) ;
        dfs(arr , vis , i  , j+1 , ls1) ;
        dfs(arr , vis , i + 1 , j , ls1) ;
        dfs(arr , vis , i - 1 , j , ls1) ;
    }
}