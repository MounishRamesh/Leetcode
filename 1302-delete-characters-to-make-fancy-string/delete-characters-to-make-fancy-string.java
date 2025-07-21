class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder() ;
        int count = 1 ;
        for(int i = 1 ;i < s.length() ;i ++){
           char ch = s.charAt(i) ;
           char ch1 = s.charAt(i-1) ;
            if(ch == ch1){
                count ++ ;
            }
            else{
                count = 1 ;
            }
            if(count >= 3){
                continue ;
            }
            sb.append(ch1) ;
        }
        if(count < 3){
            sb.append(s.charAt(s.length()-1)) ;
        }
        else{
            int val = 1 ;
            for(int i = 0 ;i < val ; i ++){
                sb.append(s.charAt(s.length()-1)) ;
            }
        }
        return sb.toString() ;
    }
}