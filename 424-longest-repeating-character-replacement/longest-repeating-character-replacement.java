class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26] ;
        int win = 0 ;
        int fre = 0 ;
        int l = 0 ;
        for(int i = 0 ;i < s.length() ;i ++){
            arr[s.charAt(i) - 'A'] ++ ; 
            fre = Math.max(arr[s.charAt(i)  - 'A'],fre) ;
            int winl = i-l + 1 ;
            if(winl - fre > k){
                arr[s.charAt(l) - 'A'] -- ;
                l ++ ;
            }
            winl = i-l+1 ;
            win = Math.max(win,winl); 
        }
        return win ;
    }
}