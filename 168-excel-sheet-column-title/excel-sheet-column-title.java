class Solution {
    public String convertToTitle(int num) {
        StringBuilder sb = new StringBuilder() ;
        while(num > 0){
            num -- ;
            char ch = (char)('A'+(num%26)) ;
            sb.append(ch) ;
            num /= 26 ;
        }
        return sb.reverse().toString() ;
    }
}