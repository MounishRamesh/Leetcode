class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int count = 0 ;
        String[] arr = sentence.split(" ") ;
        for(int i =0  ;i < arr.length ;i ++){
            String s = arr[i] ;
            if(isequals(s,searchWord)){
                return i+1 ;
            }
        }
        return -1 ;
    }
    public static boolean isequals(String s , String sw){
        if(s.length() < sw.length()){
            return false ;
        }
        for(int i = 0 ; i < sw.length() ;i ++){
            char ch = s.charAt(i) ;
            char ch1 = sw.charAt(i) ;
            if(ch != ch1){
                return false ;
            }
        }
        return true ;
    }
}