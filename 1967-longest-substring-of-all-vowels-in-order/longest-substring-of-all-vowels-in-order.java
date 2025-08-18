class Solution {
    public int longestBeautifulSubstring(String word) {
        int count = 0 ;
        int a = 1;
        int vowel_length = 1 ;
        for(int i = 0 ;i < word.length() ;i ++){
            if(i > 0 && word.charAt(i) >= word.charAt(i-1)){
                a ++ ;
                if(word.charAt(i) != word.charAt(i-1)){
                    vowel_length ++ ;
                }
            }
            else{
                a = 1 ;
                if(word.charAt(i) == 'a'){
                    vowel_length = 1 ;
                }
                else{
                    vowel_length = 0 ;
                }
            }
            if(vowel_length == 5){
                count = Math.max(count , a) ;
            }
        }
        return count; 
    }
}