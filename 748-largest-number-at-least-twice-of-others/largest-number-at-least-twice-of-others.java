class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0] ;
        for(int i = 1 ; i < nums.length ;i ++){
            max = Math.max(max,nums[i]) ;
        }
        int ind = 0 ;
        for(int i = 0 ;i < nums.length ;i++){
            if(nums[i] != max){
                int num = nums[i] * 2 ;
                if(num > max){
                    return -1 ;
                }
            }
            else{
                ind = i ;
            }
        }
        return ind; 
    }
}