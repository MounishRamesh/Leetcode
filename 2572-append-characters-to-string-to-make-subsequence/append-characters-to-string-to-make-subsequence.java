class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0 ;
        int j = 0 ;
        boolean ans = true ;
        while(i < s.length() && j < t.length()){
            char ch = s.charAt(i) ;
            char ch1 = t.charAt(j) ;
            System.out.print(ch + " " + ch1) ;
            if(ch == ch1){
                i ++ ;
                j ++ ;
            }
            else{
                ans = false ;
                i ++ ;
            }
        }
        if(ans){
            return 0 ;
        }
        return (t.length())-j ;
    }
}