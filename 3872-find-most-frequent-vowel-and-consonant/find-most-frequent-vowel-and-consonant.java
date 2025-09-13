class Solution {
    public int maxFreqSum(String s) {
        String s1 = "aeiou" ;
        HashMap<Character , Integer > hs = new HashMap<>() ;
        HashMap<Character , Integer > hs1 = new HashMap<>() ;
        for(int i = 0 ; i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            if(s1.indexOf(ch) != -1){
                hs.put(ch , hs.getOrDefault(ch , 0)+1) ;
            }
            else{
                hs1.put(ch , hs1.getOrDefault(ch  , 0)+1) ;
            }
        }
        int max = 0 ;
        int max2 = 0 ;
        for(int i : hs.values()){
            max = Math.max(max , i) ;
        }
        for(int i : hs1.values()){
            max2 = Math.max(max2 , i) ;
        }
        return max + max2 ;
    }
}