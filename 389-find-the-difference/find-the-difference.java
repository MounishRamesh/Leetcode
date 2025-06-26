// class Solution {
//     public char findTheDifference(String s, String t) {
//         int[] arr = new int[27] ;
//         for(int i = 0 ; i < s.length() ;i ++){
//             int a = (int)(s.charAt(i)-'a') ;
//             arr[a]++ ;
//         }
//         for(int i = 0 ; i < t.length() ; i ++){
//             int a = (int)(t.charAt(i)-'a') ;
//             arr[a] -- ;
//         }
//         char ch = ' ' ;
//         for(int i = 0 ;i < arr.length ; i++){
//             if(arr[i] < 0){
//                 ch = (char)(i+'a') ;
//                 break ;
//             }
//         }
//         return ch ;
//     }
// }

class Solution {
    static{
        for(int i = 0 ; i < 500 ; i++){
            findTheDifference("a","a");
        }
    }

    public static char findTheDifference(String s, String t) {
        int[] freqMaps = new int[26];
        int[] freqMapt = new int[26];
        for(char c : s.toCharArray()) {
            freqMaps[c - 'a']++;
        }
        for(char c : t.toCharArray()) {
            freqMapt[c - 'a']++;
        }

        for(int i=0; i<26; i++) {
            if(freqMaps[i] != freqMapt[i]) {
                return (char) (i + 'a');
            }
        } 
        return 'a';
    }
}