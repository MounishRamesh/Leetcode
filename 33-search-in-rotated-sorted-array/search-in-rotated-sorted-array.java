class Solution {
    public int search(int[] nums, int target) {
        for(int i = 0 ;i < nums.length ;i ++){
            for(int j = i  ;j < nums.length ;j ++){
                if(nums[j] == target){
                    return j ;
                }
            }
            break ;
        }
        return -1 ;
    }
}