class Solution {
    public int longestContinuousSubstring(String s) {
        int count = 1 ;
        int i = 0; 
        int j = 1 ;
        int max = 1 ;
        while(i< s.length() && j < s.length()){
            char ch = s.charAt(i) ;
            char next = (char)(ch + 1) ;
            if(s.charAt(j) == next){
                System.out.println(next + " " + s.charAt(j) + " ") ;
                count ++ ;
                System.out.println(count) ;
            }
            else{
                count = 1 ;
            }
            i ++ ;
            j ++ ;
            max = Math.max(max,count) ;
        }
        return max ;
    }
}