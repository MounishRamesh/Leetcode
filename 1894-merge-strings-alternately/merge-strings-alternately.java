class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0 ;
        int j = 0 ;
        int n = word1.length() ;
        int m = word2.length() ;
        StringBuilder sb = new StringBuilder() ;
        while(i < n || j < m){
            if(i < n){
                char ch = word1.charAt(i) ;
                sb.append(ch) ;
            }
            if(j < m){
                char ch = word2.charAt(j) ;
                sb.append(ch) ;
            }
            i ++ ;
            j ++ ;
        }
        return sb.toString() ;
    }
}