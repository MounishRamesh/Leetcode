class Solution {
    public String convertToTitle(int a) {
        StringBuilder sb = new StringBuilder() ;
        while(a > 0){
            a -- ;
            char ch = (char)('A' + (a%26)) ;
            sb.insert(0,ch) ;
            a/= 26 ;
        }
        return sb.toString() ;
    }
}