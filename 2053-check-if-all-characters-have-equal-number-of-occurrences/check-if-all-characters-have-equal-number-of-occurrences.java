class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character , Integer > hs= new HashMap<>() ;
        for(int i = 0 ;i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            hs.put(ch ,hs.getOrDefault(ch,0)+1) ;
        }
        int count = -1 ;
        for(int i : hs.values()){
            if(count == -1){
                count = i ;
            }
            else if(i != count){
                return false ;
            }
        }
        return true;
    }
}