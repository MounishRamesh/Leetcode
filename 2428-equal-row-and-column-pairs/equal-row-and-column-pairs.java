class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0 ;
        int m = grid.length ;
        int n = grid[0].length ;
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if(equals(grid , i , j)){
                    count ++ ;
                }
            }
        }
        return count ;
    }
    public static boolean equals(int[][] arr , int i , int j){
        List<Integer> ls = new ArrayList<>();
        List<Integer> ls1 = new ArrayList<>() ;
        for(int i1 = 0 ; i1 < arr.length ; i1 ++){
            ls.add(arr[i][i1]) ;
            ls1.add(arr[i1][j]) ;
        }
        
        return ls.equals(ls1) ;
    }
}