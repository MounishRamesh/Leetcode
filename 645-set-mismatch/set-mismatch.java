class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2] ;
        HashMap<Integer,Integer> hs = new HashMap<>() ;
        for(int i = 0 ;i < nums.length; i ++){
            if(hs.containsKey(nums[i])){
                arr[0] = nums[i] ;
                break ;
            }
            else{
                hs.put(nums[i] , 1) ;
            }
         }
         int sum = 0 ;
         int sum1 = 0; 
         for(int i : nums){
            sum = sum + i ;
         }
         sum = sum - arr[0];
         for(int i = 1 ;i <= nums.length; i++){
            sum1 += i ;
         }
         arr[1] = sum1-sum ;
         return arr ;
    }
}