class Solution {
    public String largestOddNumber(String num) {
        int ind = -1 ;
        String s = "02468" ;
        for(int i = 0 ; i < num.length() ; i ++){
            char ch = num.charAt(i) ;
            if(s.indexOf(ch) == -1){
                ind = i ;
            }
        }
        StringBuilder sb = new StringBuilder() ;
        for(int i = 0 ; i <= ind ; i ++){
            char ch = num.charAt(i) ;
            sb.append(ch) ;
        }
        return sb.toString() ;
    }
}