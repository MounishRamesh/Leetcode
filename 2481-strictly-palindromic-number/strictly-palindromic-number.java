class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2 ; i <= n-2 ; i ++){
            String a = number(i,n) ;
            // System.out.println(a) ;
            if(!pla(a)){
                return false ;
            }
        }
        return true ;
    }
    public static String number(int i,int n){
        StringBuilder sb = new StringBuilder() ;
        while(n > 0){
            int rem = n%i ;
            sb.append(rem) ;
            n/= i ;
        }
        return sb.toString() ;
    }
    public static boolean pla(String s){
        int i = 0 ;
        int j = s.length()-1 ;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false ;
            }
            i ++ ;
            j -- ;
        }
        return true; 
    }
}