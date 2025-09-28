class Solution {
    public String longestPrefix(String s) {
        int j = 0 ;
        int[] arr = new int[s.length()] ;
        int len = 0 ;
        for(int i = 1 ; i < s.length() ; i ++){
            while(len > 0 && s.charAt(i)!= s.charAt(len)){
                len = arr[len-1] ;
            }
            if(s.charAt(i) == s.charAt(len)){
                len ++ ;
                arr[i] = len ;
            }
        }
        int a = arr[s.length()-1] ;
        return s.substring(0,a) ;
    }
}