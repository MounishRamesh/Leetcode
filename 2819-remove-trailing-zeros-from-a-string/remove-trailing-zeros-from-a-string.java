class Solution {
    public String removeTrailingZeros(String s) {
        StringBuilder sb = new StringBuilder() ;
        int ind = 0 ;
        for(int i = s.length()-1 ; i >= 0 ; i --){
            int a = (int)(s.charAt(i) - '0') ;
            
            System.out.println(a) ;
            if(a != 0){
                ind = i ;
                break ;
            }
        }
        for(int i = 0 ; i <= ind ; i ++){
            sb.append(s.charAt(i)) ;
        }
        return sb.toString() ;
    }
}