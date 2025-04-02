class Solution {
    public long maximumTripletValue(int[] nums) {
        long sum = Long.MIN_VALUE;
        for(int i =0 ; i< nums.length-2 ; i++){
            for(int j = i+1 ; j < nums.length-1;j ++){
                long val = nums[i]-nums[j] ;
                for(int k = j+1 ; k < nums.length ; k ++){
                    long ans = val * nums[k] ;
                    sum = Math.max(sum , ans) ;
                }
            }
        }
        
        return Math.max(sum,0) ;
    }
}