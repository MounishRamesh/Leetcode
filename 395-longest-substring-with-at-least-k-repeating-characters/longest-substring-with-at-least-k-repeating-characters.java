class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length() == 0 || s.length() < k){
            return 0 ;
        }
        HashMap<Character,Integer > hs = new HashMap<>() ;
        for(int i =0 ; i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            if(hs.containsKey(ch)){
                hs.put(ch , hs.get(ch) + 1) ;
            }
            else{
                hs.put(ch , 1) ;
            }
        }
        for(char ch : hs.keySet()){
            if(hs.get(ch) < k){
                int min =0 ;
                String[] arr = s.split(String.valueOf(ch)) ;
                for(String val : arr){
                    int len = longestSubstring(val,k) ;
                    min = Math.max(min , len) ;
                }
                return min ;
            }
        }
        return s.length() ;
    }
}

