class Solution {
    public String addSpaces(String s, int[] spaces) {
        int i = 0 ;
        int j = 0 ;
        int val = 0 ;
        StringBuilder sb = new StringBuilder() ;
        while(i < s.length() ){
            if(j < spaces.length && i == spaces[j]){
                sb.append(" ") ;
                j ++ ;
            }
            else{
                sb.append(s.charAt(i)) ;
                i ++ ;
            }
        }
        return sb.toString() ;
    }
}