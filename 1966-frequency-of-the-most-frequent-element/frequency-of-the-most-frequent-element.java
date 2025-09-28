class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums) ;
        int j = 0 ;
        long count = 0 ;
        int max =0 ;
        for(int i = 0 ;i < nums.length ;i ++){
            count += nums[i] ;
            while((long)nums[i] * (i-j+1) - count > (long)k){
                count -= nums[j] ;
                j ++ ;
            }
            max = Math.max(max , i-j+1) ;
        }
        return max ;
    }
}