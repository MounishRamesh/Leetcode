class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE ;
        int sum = 1 ;
        Arrays.sort(nums);
        int n = nums.length ;
        // for(int i = 0  ; i< 3 ;i++){
        //     sum = sum * nums[i] ;
        // }
        // max = sum ;
        // for(int i = 3 ; i < nums.length ; i++){
        //     sum = sum / nums[i-3] ;
        //     sum = sum * nums[i] ;
        //     max = Math.max(sum , max) ;
        // }
        // return max ;
        return Math.max(nums[n-1] * nums[n-2] * nums[n-3], nums[0] * nums[1] * nums[n-1]);
    }
}