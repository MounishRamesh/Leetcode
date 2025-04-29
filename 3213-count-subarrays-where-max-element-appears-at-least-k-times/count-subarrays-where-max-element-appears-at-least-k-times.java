class Solution {
    public long countSubarrays(int[] nums, int k) {
        long count = 0 ;
        int max = 0 ;
        int j = 0 ;
        for(int i : nums){
            max = Math.max(i,max) ;
        }
        int val = 0 ;
        for(int i = 0 ;i < nums.length ;i ++){
            if(nums[i] == max){
                val ++ ;
            }
            while(val == k){
                count += nums.length-i ;
                if(nums[j] == max){
                    val -- ;
                }
                j ++ ;
            }
        }
        return count ;
    }
}