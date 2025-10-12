class Solution {
    public int minCost(String c, int[] n) {
        int count = 0 ;
        for(int i = 1 ; i < c.length() ; i ++){
            if(c.charAt(i) == c.charAt(i-1)){
                count += Math.min(n[i] , n[i-1]) ;
                n[i] = Math.max(n[i] , n[i-1]) ;
            }
        }
        return count ;
    }
}