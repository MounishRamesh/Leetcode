class Solution {
    public String longestNiceSubstring(String s) {
        StringBuilder sb = new StringBuilder() ;
        String s2 = "" ;
        int max =0 ;
        for(int i =0 ;i < s.length() ;i ++){
            for(int j = i+1 ; j< s.length() ;j ++){
                if(isniece(s.substring(i , j+1))){
                    int length = j-i+1 ;
                    if(length > max){
                        s2 = s.substring(i,j+1) ;
                        max = length ;
                    }
                }
            }
        }
        return s2 ;
    }
    public static boolean isniece(String s1){
        HashSet<Character> hs = new HashSet<>() ;
        for(char ch : s1.toCharArray()){
            hs.add(ch) ;
        }
        for(char ch : hs){
            char lower = Character.toLowerCase(ch) ;
            char upper = Character.toUpperCase(ch) ;
            if(!(hs.contains(lower) && hs.contains(upper))){
                return false ;
            }
        }
        return true ;
    }
}
