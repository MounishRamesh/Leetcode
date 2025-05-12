class Solution {
    public int longestContinuousSubstring(String s) {
        int count = 1 ;
        int max = 1 ;
        for(int i =1 ;i < s.length() ;i ++){
            if(s.charAt(i)-1 == s.charAt(i-1)){
                count ++ ;
                max = Math.max(count , max) ;
            }
            else{
                count = 1 ;
            }
        }
        return max ;
    }
}