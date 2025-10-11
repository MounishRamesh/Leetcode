class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0,s.length()/2) ;
        String b = s.substring(s.length()/2 , s.length()) ;
        int val = vow(a) ;
        int val2 = vow(b) ;
        return val == val2 ;
    }
    public static int vow(String a){
        String s = "aeiouAEIOU" ;
        int count = 0 ;
        for(char ch : a.toCharArray()){
            if(s.indexOf(ch) != -1){
                count ++ ;
            }
        }
        return count ;
    }
}