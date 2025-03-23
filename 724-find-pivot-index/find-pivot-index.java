class Solution {
    public int pivotIndex(int[] nums) {
        int count = 0 ;
        for(int i = 0 ;i < nums.length ; i++){
            count = count + nums[i] ;
        }
        int left = 0 ;
        for(int i = 0 ; i < nums.length ;i ++){
            int right = count - left - nums[i] ;
            if(left == right){
                return i ;
            }
            left = left + nums[i] ;
        }
        return -1 ;
    }
}