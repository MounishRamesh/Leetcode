class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hs= new HashMap<>() ;
        int count = 0 ;
        int max = 0 ;
        int i1 = 0 ;
        int j = 0 ;
        for(int i = 0 ;i < s.length() ; i++){
            char ch = s.charAt(i) ;
            if(hs.containsKey(ch)){
                hs.put(ch,hs.get(ch)+1) ;
                j ++ ;
            }
            else{
                hs.put(ch,1) ;
                j ++ ;
            }
            while(hs.get(ch) > 2){
                int val = hs.get(s.charAt(i1))-1 ;
                hs.put(s.charAt(i1),val) ;
                if(val == 0){
                    hs.remove(s.charAt(i1)) ;
                }
                i1 ++ ;
            }
            count = i-i1 + 1 ;
            max = Math.max(count,max); 
        }
        return max ;
    }
}