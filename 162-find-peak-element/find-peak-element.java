class Solution {
    public int findPeakElement(int[] nums) {
        int count = 0;
        int max  = Integer.MIN_VALUE ;
        for(int i = 0 ; i < nums.length ;i ++){
            if(nums[i] > max){
                count = i ;
                max = nums[i] ;
            }
        }
        return count ;

    }
}