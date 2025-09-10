class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = nums[0] ;
        int t_max = nums[0] ;
        int max = nums[0] ;
        int t_min = nums[0] ;
        int min = nums[0] ;
        for(int i = 1 ; i < nums.length ;i ++){
            int val = nums[i] ;
            t_max = Math.max(val , t_max+val) ;
            max = Math.max(max , t_max) ;
            t_min = Math.min(val , t_min+val) ;
            min = Math.min(min , t_min) ;
            sum += val ;
        }
        if(sum == min){
            return max ;
        }
        // System.out.println(max + " " + sum + " " + min) ;
        int ans = Math.max(max , (sum-min)) ;
        return ans ;
    }
}