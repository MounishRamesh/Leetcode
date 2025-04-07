class Solution {
    public int findFinalValue(int[] nums, int original) {
        int i = 0 ;
        int k = original ;
        while(i < nums.length){
            if(nums[i] == k){
                k = k * 2 ;
                i = -1 ;
            }
            i ++ ;
        }
        return k ;
    }
}