class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = 0 ;
        int ans = Integer.MAX_VALUE ;
        for(int i = 0 ;i < k ;i++){
            if(blocks.charAt(i) == 'W'){
                min ++ ;
            }
        }
        ans = min ;
        for(int i = k ; i < blocks.length() ; i ++){
            if(blocks.charAt(i-k) == 'W'){
                ans -- ;
            }
            if(blocks.charAt(i) == 'W'){
                ans ++ ;
            }
            min = Math.min(ans, min) ;
        }
        return min ;
    }
}