class Solution {
    public boolean validPalindrome(String s) {
        int i = 0 ;
        int j = s.length()-1 ;
        boolean val = true ;
        int count =  0 ;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                count ++ ;
                if(count >= 2){
                    return false ;
                }
                if(i+1 == j || j-1 == i){
                    i ++ ;
                    j -- ;
                    continue ;
                }
                if((s.charAt(i+1) == s.charAt(j)) && (s.charAt(j-1) == s.charAt(i))){
                    i += 1 ;
                    j -= 1 ;
                    count -- ;
                    continue ;
                }
                if(s.charAt(i+1) == s.charAt(j)){
                    i ++ ;
                    continue ;
                }
                if(s.charAt(j-1) == s.charAt(i)){
                    j -- ;
                    continue ;
                }
                
                else{
                    return false ;
                }
                
            }
            i ++ ;
            j -- ;
        }
        if(s.length() == 3 && count >= 1){
            return false ;
        }
        return true ;
    }
}