class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k){
            return false; 
        }
        HashMap<Character , Integer > hs = new HashMap<>() ;
        for(int i = 0 ; i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            hs.put(ch , hs.getOrDefault(ch , 0)+1) ;
        }
        int count = 0 ;
        for(char i : hs.keySet()){
            int val = hs.get(i) ;
            if(val%2 == 1){
                count ++ ;
            }
        }
        if(count <= k){
            return true ;
        }
        return false ;
    }
}