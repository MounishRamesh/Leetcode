class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[27] ;
        for(int i = 0 ; i < s.length() ;i ++){
            int a = (int)(s.charAt(i)-'a') ;
            arr[a]++ ;
        }
        for(int i = 0 ; i < t.length() ; i ++){
            int a = (int)(t.charAt(i)-'a') ;
            arr[a] -- ;
        }
        char ch = ' ' ;
        for(int i = 0 ;i < arr.length ; i++){
            if(arr[i] < 0){
                ch = (char)(i+'a') ;
                break ;
            }
        }
        return ch ;
    }
}