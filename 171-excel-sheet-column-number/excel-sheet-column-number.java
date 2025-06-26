class Solution {
    public int titleToNumber(String s) {
        int digit = 0 ;
        for(int i = 0 ; i < s.length() ; i ++){
            char ch = s.charAt(i);
            int a = (ch - 'A') ;
            digit = (digit*26) +a +1;
        }
        return digit ;
    }
}

// class Solution {
//     public int titleToNumber(String columnTitle) {
//         int ans=0;
//         for(int i=0;i<columnTitle.length();i++){
//             char c=columnTitle.charAt(i);
//             int j=(c-'A');
//             ans=(ans*26)+j+1;
//         }
//         return ans;
//     }
// }