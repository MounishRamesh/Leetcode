class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean ans = false ;
        for(int i = 0 ;i < nums.length-1 ;i ++){
            if(nums[i] != nums[i+1] && nums[i] <= nums[i+1]){
                for(int j = i ;j < nums.length-1 ;j ++){
                    ans = true ;
                    if(nums[j] > nums[j+1]){
                        return false ;
                    }
                }
            }
            else if(nums[i] != nums[i+1] && nums[i] > nums[i+1]){
                for(int j = i ; j < nums.length-1 ;j ++){
                    ans = true ;
                    if(nums[j] < nums[j+1]){
                        return false ;
                    }
                }
            }
            if(ans){
                break ;
            }
            
        }
        return true ;
    }
}