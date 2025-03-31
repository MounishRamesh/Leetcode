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
        return helper(s, 0, s.length(), k);
    }
    
    private int helper(String s, int start, int end, int k) {
        if (end - start < k) return 0; // If substring length is less than k, return 0
        
        int[] count = new int[26]; // Frequency array for characters
        for (int i = start; i < end; i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        for (int i = start; i < end; i++) {
            if (count[s.charAt(i) - 'a'] > 0 && count[s.charAt(i) - 'a'] < k) {
                // Split and process both halves separately
                int next = i + 1;
                while (next < end && count[s.charAt(next) - 'a'] < k) {
                    next++;
                }
                return Math.max(helper(s, start, i, k), helper(s, next, end, k));
            }
        }
        
        return end - start; // If all characters meet the k condition, return the substring length
    }
}