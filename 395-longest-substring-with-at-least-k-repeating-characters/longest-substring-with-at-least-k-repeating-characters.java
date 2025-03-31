// class Solution {
//     public int longestSubstring(String s, int k) {
//         if(s.length() == 0 || s.length() < k){
//             return 0 ;
//         }
//         HashMap<Character,Integer > hs = new HashMap<>() ;
//         for(int i =0 ; i < s.length() ;i ++){
//             char ch = s.charAt(i) ;
//             if(hs.containsKey(ch)){
//                 hs.put(ch , hs.get(ch) + 1) ;
//             }
//             else{
//                 hs.put(ch , 1) ;
//             }
//         }
//         for(char ch : hs.keySet()){
//             if(hs.get(ch) < k){
//                 int min =0 ;
//                 String[] arr = s.split(String.valueOf(ch)) ;
//                 for(String val : arr){
//                     int len = longestSubstring(val,k) ;
//                     min = Math.max(min , len) ;
//                 }
//                 return min ;
//             }
//         }
//         return s.length() ;
//     }
// }
class Solution {
    public int longestSubstring(String s, int k) {
        int freq [] = new int [26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int max =0;
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']<k&&freq[s.charAt(i)-'a']>0){
                int right =longestSubstring(s.substring(0,i),k);
                int left = longestSubstring(s.substring(i+1),k);
                return  max = Math.max(right,left);
            }
        }
        return s.length();
    }
}