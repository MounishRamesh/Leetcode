class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder() ;
        sb.append(s) ;
        while(sb.toString().length() > 2){
            String s1 = sb.toString() ;
            sb.setLength(0) ;
            for(int i = 0 ; i < s1.length()-1 ; i ++){
                int a = s1.charAt(i)-'0' ;
                int b = s1.charAt(i+1)-'0' ;
                int ans = (a+b)%10 ;
                sb.append(ans) ;
            }
        }
        String s2 = sb.toString() ;
        char ch = s2.charAt(0) ;
        char ch1 = s2.charAt(1) ;
        return ch == ch1 ;
    }
}