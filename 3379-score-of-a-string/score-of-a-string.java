class Solution {
    public int scoreOfString(String s) {
        int count = 0 ;
        for(int i = 0 ; i < s.length()-1 ;i ++){
            int val = (int)(s.charAt(i)) ;
            int val2 = (int)(s.charAt(i+1)) ;
            int ans = Math.abs(val2 - val) ;
            count += ans ;
        }
        return count ;
    }
}