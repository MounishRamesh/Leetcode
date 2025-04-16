class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer , Integer> hs = new HashMap<>() ;
        for(int i : arr){
            hs.put(i ,hs.getOrDefault(i , 0)+1) ;
        }
        int count = 0 ;
        boolean ans = false ;
        for(int i : hs.keySet()){
            int val = hs.get(i) ;
            if(val == i){
                count = Math.max(count , i); 
                ans = true ;
            }
        } 
        if(ans ){
            return count ;
        }
        return -1 ;
    }
}