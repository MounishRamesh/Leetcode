class Solution {
    public int maximumCount(int[] nums) {
        int count = 0 ;
        int count2 = 0 ;
        int max = 0 ;
        for(int i = 0 ;i < nums.length ;i ++){
            if(nums[i] < 0){
                count ++ ;
            }
            else if(nums[i] > 0){
                count2 ++ ;
            }
            max = Math.max(count,count2) ;
        }
        return max ;
    }
}