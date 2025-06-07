class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0 ;
        for(int i =0  ; i < nums.length ;i ++){
            int count = 1 ;
            for(int j = i ;j < nums.length-1  ;j ++){
                if(nums[j] < nums[j+1]){
                    count ++ ;
                }
                else{
                    break ;
                }
            }
            max = Math.max(max , count) ;
        }
        return max ;
    }
}