class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "" ;
        }
        String s = ""; 
        int gcd_val = gcd(str1.length() , str2.length()) ;
        s = str1.substring(0,gcd_val) ;
        return s ;
    }
    public static int gcd (int s1 , int s2){
        if(s2 == 0){
            return s1 ;
        }
        return gcd(s2 , s1%s2) ;
    }
}