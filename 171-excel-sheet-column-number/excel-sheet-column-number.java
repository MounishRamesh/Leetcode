class Solution {
    public int titleToNumber(String s) {
        int digit = 0 ;
        for(int i = 0 ; i < s.length() ; i ++){
            char ch = s.charAt(i);
            int a = (ch - 'A')+1 ;
            digit = (digit*26) +a ;
            System.out.println(digit) ;
        }
        return digit ;
    }
}