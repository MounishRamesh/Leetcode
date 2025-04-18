// class Solution {
//     public String countAndSay(int n) {
//         StringBuilder sb = new StringBuilder() ;
//         int a = 1 ;
//         String s = "1" ;
//         for(int i = 1 ;i < n ; i ++){
//             s = countandsay(s) ;
//             System.out.print(s + " ") ;
//         }
//         return s ;
//     }
//     public static String countandsay(String s){
//         int n = s.length() ;
//         StringBuilder sb = new StringBuilder() ;
//         int count = 1 ;
//         for(int i = 1 ;i < n ;i ++){
//             char ch = s.charAt(i) ;
//             char ch1 = s.charAt(i-1) ;
//             if(ch == ch1){
//                 count ++ ;
//             }
//             else{
//                 sb.append(Integer.toString(count)) ;
//                 sb.append(Character.toString(s.charAt(i-1))) ;
//                 count = 1 ;
//             }
//         }
//         sb.append(Integer.toString(count)) ;
//         sb.append(Character.toString(s.charAt(n-1))) ;
//         return sb.toString() ; 
//     }
// }

class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i=2; i<= n; i++){
            s = countandAdd(s);
        }
        return s;
    }
    String countandAdd(String s){
        StringBuilder currString = new StringBuilder();
        char ch = s.charAt(0);
        int count = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == ch){
                count++;
            }
            else{
                currString.append(count);
                currString.append(ch);
                ch = s.charAt(i);
                count = 1;
            }
        }
        currString.append(count);
        currString.append(ch);
        return currString.toString();
    }
}