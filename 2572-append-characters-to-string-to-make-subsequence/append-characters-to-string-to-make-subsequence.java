class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0 ;
        int j = 0 ;
        boolean ans = true ;
        while(i < s.length() && j < t.length()){
            char ch = s.charAt(i) ;
            char ch1 = t.charAt(j) ;
            if(ch == ch1){
                j ++ ;
            }
            i ++ ;
        }
        return (t.length())-j ;
    }
}