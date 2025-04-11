class Solution {
    public int minimumRounds(int[] tasks) {
        int count = 0 ;
        HashMap<Integer , Integer > hs = new HashMap<>() ;
        for(int num : tasks){
            if(hs.containsKey(num)){
                hs.put(num , hs.get(num) + 1) ;
            }
            else{
                hs.put(num , 1); 
            }
        }
        for(int val : hs.keySet()){
            int ans = hs.get(val) ;
            if(ans == 1){
                return -1 ;
            }
            if(ans % 3 == 0){
                count = count + ans /3 ;
            }
            else{
                count = count + (ans / 3) + 1 ;
            }
        }
        return count ;
    }
}