class Solution {
    public boolean checkIfPangram(String s) {
        boolean[] arr = new boolean[26] ;
        for(int i = 0 ; i < s.length(); i ++){
            int ch = s.charAt(i)-'a' ;
            arr[ch] = true ;
        }
        for(boolean i : arr){
            if(!i){
                return false ;
            }
        }
        return true ;
    }
}