class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder() ;
        int a = 1 ;
        String s = "1" ;
        for(int i = 1 ;i < n ; i ++){
            s = countandsay(s) ;
            System.out.print(s + " ") ;
        }
        return s ;
    }
    public static String countandsay(String s){
        int n = s.length() ;
        StringBuilder sb = new StringBuilder() ;
        int count = 1 ;
        for(int i = 1 ;i < n ;i ++){
            char ch = s.charAt(i) ;
            char ch1 = s.charAt(i-1) ;
            if(ch == ch1){
                count ++ ;
            }
            else{
                sb.append(Integer.toString(count)) ;
                sb.append(Character.toString(s.charAt(i-1))) ;
                count = 1 ;
            }
        }
        sb.append(Integer.toString(count)) ;
        sb.append(Character.toString(s.charAt(n-1))) ;
        return sb.toString() ; 
    }
}