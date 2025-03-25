class Solution {
    public int maxPower(String s) {
        int i = 0 ;
        int j = 1 ;
        int count = 0 ;
        int sum =0 ;
        if(s.length() <= 1){
            return 1 ;
        }
        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                j ++ ;
            }
            else{
                i = j ;
                j ++ ;
            }
            count = j-i+1 ;
            sum = Math.max(sum,count) ;
        }
        return sum-1 ;
    }
}