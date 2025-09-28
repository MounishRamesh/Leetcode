class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums) ;
        int min = Integer.MIN_VALUE ;
        int max = Integer.MAX_VALUE ;
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i+1 ; j < nums.length ; j ++){
                for(int k = j+1 ;k < nums.length ;k++){
                    int val = nums[i]+nums[j]+nums[k] ;
                    if(val <= target){
                        min = Math.max(min,val) ;
                    }
                    else if(val > target){
                        max = Math.min(max,val) ;
                    }
                }
            }
        }
        long diff = Math.abs((long)min-target) ;
        long diff2 = Math.abs((long)max-target) ;
        if(diff <= diff2){
            return min ;
        }
        return max ;
    }
}