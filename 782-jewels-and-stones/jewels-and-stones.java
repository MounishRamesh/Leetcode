class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hs = new HashMap<>() ;
        for(int i =0  ;i < jewels.length() ;i ++){
            hs.put(jewels.charAt(i) , 1) ;
        }
        int count = 0 ;
        for(int i = 0 ;i < stones.length() ;i ++){
            if(hs.containsKey(stones.charAt(i))){
                count ++ ;
            }
        }
        return count  ;
    }
}