class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "" ; 
        Arrays.sort(strs) ; 
        String first = strs[0] ; 
        String last = strs[strs.length-1] ; 
        for(int i = 0 ; i <= first.length()-1 ; i ++){
            if(first.charAt(i)==last.charAt(i)){
                s = s + first.charAt(i) ;
            }
            else{
                break ; 
            }
        }
        return s ; 
    }
}