class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums) ;
        int val = nums.length - k ;
        for(int i = nums.length-1 ; i >= 0 ; i --){
            if(val == i){
                return nums[i] ;
            }
        }
        return 0 ;
    }
}