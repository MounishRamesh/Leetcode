class Solution {
    public int minimumOperations(int[] nums) {
            int count = 0 ;
            int i; 
            HashMap<Integer,Integer> hs = new HashMap<>() ;
            for(i = nums.length-1 ;i >= 0; i--){
                if(hs.containsKey(nums[i])){
                    break ;
                }
                else{
                    hs.put(nums[i] , 1) ;
                }
            }
            
            return (i+3)/3 ;
    }
}