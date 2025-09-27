class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s) ;
        int i = 0 ;
        int count = 0 ;
        while(i < g.length){
            int ans = g[i] ;
            for(int j = 0 ; j < s.length ;j ++){
                if(ans <= s[j] && s[j] != -1){
                    s[j] = -1 ;
                    count ++ ;
                    break ;
                }
            }
            i ++ ;
        }
        return count ;
    }
}