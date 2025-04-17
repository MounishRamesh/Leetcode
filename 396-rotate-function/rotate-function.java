class Solution {
    public int maxRotateFunction(int[] nums) {
        int count = 0 ;
        int sum = 0 ;
        int ans = 0 ;
        for(int i = 0 ; i < nums.length; i ++){
            sum += nums[i] ;
            ans = ans + ( i * nums[i]) ;
        }
        int n = nums.length ;
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ;i < nums.length ;i ++){
            ans = ans - sum + (nums[i] * n) ;
            max = Math.max(max , ans) ;
        }
        return max ;
    }
}