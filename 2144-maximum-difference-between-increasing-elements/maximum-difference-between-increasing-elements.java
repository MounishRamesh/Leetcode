class Solution {
    public int maximumDifference(int[] nums) {
        int max = 0 ;
        for(int i = 0 ; i< nums.length ; i++){
            int count = 0 ;
            for(int j = i+1 ;j < nums.length ;j ++){
                if(i < j && (nums[i] < nums[j])){
                    count = Math.max(count , nums[j] - nums[i]) ;
                }
                max = Math.max(count , max) ;
            }
        }
        if(max == 0){
            return -1 ;
        }
        return max ;
    }
}