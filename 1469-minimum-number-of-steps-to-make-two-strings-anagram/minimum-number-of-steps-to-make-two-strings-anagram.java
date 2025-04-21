// class Solution {
//     public int minSteps(String s, String t) {
//         int count = 0 ;
//         HashMap<Character , Integer> hs = new HashMap<>() ;
//         for(int i = 0 ;i < s.length() ;i ++){
//             char ch = s.charAt(i) ;
//             hs.put(ch , hs.getOrDefault(ch , 0)+1) ;
//         }
//         for(int i = 0 ;i < t.length() ;i ++){
//             char ch1 = t.charAt(i) ;
//             if(!(hs.containsKey(ch1))){
//                 count ++ ;
//             }
//             else{
//                 hs.put(ch1,hs.get(ch1)-1) ;
//                 if(hs.get(ch1) == 0){
//                     hs.remove(ch1) ;
//                 }
//             }
//         }
//         return count ;
//     }
// }

class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int i, n = sChars.length, steps = 0;;
        for (i = 0; i < n; i++) {
            ++freq[sChars[i]-'a'];
        }
        for (i = 0; i < n; i++) {
            --freq[tChars[i]-'a'];
        }
        for (i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                steps += freq[i];
            }
        }
        return steps;
    }
}