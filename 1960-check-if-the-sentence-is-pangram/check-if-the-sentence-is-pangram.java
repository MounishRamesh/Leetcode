class Solution {
    public boolean checkIfPangram(String s) {
        int[] arr = new int[26] ;
        for(int i = 0 ; i < s.length(); i ++){
            int ch = s.charAt(i)-'a' ;
            arr[ch]++ ;
        }
        for(int i : arr){
            if(i == 0){
                return false ;
            }
        }
        return true ;
    }
}