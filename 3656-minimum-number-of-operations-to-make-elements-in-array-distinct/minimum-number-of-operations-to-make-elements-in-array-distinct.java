class Solution {
    public int minimumOperations(int[] nums) {
           int count = 0 ;
            int ind = 0; 
            HashMap<Integer,Integer> hs = new HashMap<>() ;
            for(int i = nums.length-1 ;i >= 0; i--){
                if(hs.containsKey(nums[i])){
                    ind = i+1 ;
                    break ;
                }
                else{
                    hs.put(nums[i] , 1) ;
                }
            }
            return (ind+2)/3 ;
    }
}