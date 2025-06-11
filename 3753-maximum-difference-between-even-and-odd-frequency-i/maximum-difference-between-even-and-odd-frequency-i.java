class Solution {
    public int maxDifference(String s) {
        HashMap <Character , Integer > hs = new HashMap<>() ;
        for(int i = 0 ;i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            hs.put(ch , hs.getOrDefault(ch , 0)+1) ;
        }
        int max = 0 ;
        int min = Integer.MAX_VALUE ;
        for(char i : hs.keySet()){
            int val = hs.get(i) ;
            if(val%2 != 0){
                if(val > max){
                    max = val ;
                }
            }
            else{
                if(val < min){
                    min = val ;
                }
            }
        }
        return max - min ;
    }
}