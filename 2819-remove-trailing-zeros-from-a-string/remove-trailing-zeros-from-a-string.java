class Solution {
    public String removeTrailingZeros(String s) {
        StringBuilder sb = new StringBuilder() ;
        int ind = 0 ;
        for(int i = s.length()-1 ; i >= 0 ; i --){
            int a = (int)(s.charAt(i) - '0') ;
            if(a != 0){
                ind = i ;
                break ;
            }
        }
       
        return s.substring(0,ind+1) ;
    }
}