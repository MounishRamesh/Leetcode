class Solution {
    public int countSubstrings(String s) {
        int count = 0 ;
        for(int i = 0 ;i < s.length() ; i ++){
            for(int j = i ; j < s.length(); j ++){
                String s1 = s.substring(i,j+1) ;
                if(palindrome(s1)){
                    count ++ ;
                }
            }
        }
        return count;
    }
    public static boolean palindrome(String s){
        int i = 0 ;
        int j = s.length()-1 ;
        while(i<= j){
            char ch = s.charAt(i) ;
            char ch1 = s.charAt(j) ;
            if(ch != ch1){
                return false ;
            }
            i++ ;
            j -- ;
        }
        return true ;
    }
}