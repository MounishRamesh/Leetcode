// class Solution {
//     public int appendCharacters(String s, String t) {
//         int i = 0 ;
//         int j = 0 ;
//         boolean ans = true ;
//         while(i < s.length() && j < t.length()){
//             char ch = s.charAt(i) ;
//             char ch1 = t.charAt(j) ;
//             if(ch == ch1){
//                 j ++ ;
//             }
//             i ++ ;
//         }
//         return (t.length())-j ;
//     }
// }

class Solution {
    public int appendCharacters(String s, String t) {
        int pointerS = 0, pointerT = 0;
        int sLength = s.length(), tLength = t.length();
        
        while (pointerS < sLength && pointerT < tLength) {
            if (s.charAt(pointerS) == t.charAt(pointerT)) {
                pointerT++;
            }
            pointerS++;
        }
        
        return tLength - pointerT; 
    }
}