class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0 ;
        for(int i = left ; i <= right ; i ++){
            String s = words[i] ;
            if((isvowel(s.charAt(0)) && (isvowel(s.charAt(s.length()-1) )))){
                count ++ ;
            }
        }   
        return count ;
    }
    public static boolean isvowel(char a1){
       
        if(a1 == 'a' || a1 == 'e' || a1 == 'i' || a1 == 'o' || a1 == 'u'){
             return true ;
        }
        return false  ;
    }
}