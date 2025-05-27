class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder() ;
        String[] arr = s.split(" ") ;
        for(String s1 : arr){
            for(int i = s1.length()-1 ;i >=0 ;i --){
                char ch = s1.charAt(i) ;
                sb.append(ch) ;
            }
            sb.append(" ") ;
        }
        return sb.toString().trim() ;
    }
}