class Solution {
    public int minSteps(String s, String t) {
        int count = 0 ;
        HashMap<Character , Integer> hs = new HashMap<>() ;
        for(int i = 0 ;i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            hs.put(ch , hs.getOrDefault(ch , 0)+1) ;
        }
        for(int i = 0 ;i < t.length() ;i ++){
            char ch1 = t.charAt(i) ;
            if(!(hs.containsKey(ch1))){
                count ++ ;
            }
            else{
                hs.put(ch1,hs.get(ch1)-1) ;
                if(hs.get(ch1) == 0){
                    hs.remove(ch1) ;
                }
            }
        }
        return count ;
    }
}