class Solution {
    public int findFinalValue(int[] nums, int original) {
        int k = original ;
        Set<Integer> hs = new HashSet<>() ;
        for(int i : nums){
            hs.add(i) ;
        }
        for(int i =0 ; i < nums.length; i++){
            if(hs.contains(k)){
                k = k * 2 ;
            }
            else{
                break ;
            }
        }
        return k ;
    }
}