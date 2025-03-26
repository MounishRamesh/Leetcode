class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int start = -1 ;
        int end = -1 ;
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > right){
                start = i ;
            }
            if(nums[i] >= left){
                end =i ;
            }
            count = count +(end-start) ;
        }
        return count ;
    }
}