class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a = s1.length() ;
        int b = s2.length() ;
        if(a > b){
            return false ;
        }
        HashMap<Character , Integer> hs = new HashMap<>() ;
        HashMap<Character , Integer > hs1 = new HashMap<>() ;
        char[] ch1 = s1.toCharArray() ;
        for(char i : ch1){
            hs.put(i , hs.getOrDefault(i,0)+1) ;
        }
        for(int i = 0 ;i < a ;i ++){
            char ch = s2.charAt(i) ;
            hs1.put(ch,hs1.getOrDefault(ch,0)+1) ;
        }
        if(hs.equals(hs1)){
            return true ;
        }
        for(int i = a; i < b ;i ++){
            char in = s2.charAt(i) ;
            hs1.put(in,hs1.getOrDefault(in,0)+1) ;
            char out = s2.charAt(i-a) ;
            hs1.put(out,hs1.get(out)-1); 
            if(hs1.get(out) == 0){
                hs1.remove(out) ;
            }
            if(hs.equals(hs1)){
                return true ;
            }
        }
        return false ;
    }
}