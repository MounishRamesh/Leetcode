class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0 ;
        int i = 0 ;
        int j = 0;
        long val = 0 ;
        boolean ans = false ;
        while(i < nums.length && j < nums.length){
            if(nums[i] != 0){
                j = i+1 ;
                ans = false ;
                val += count ;
                count = 0 ;
            }
            else{
                ans = true;
                count += (i-j)+1 ;
            }
            i ++ ;
        }
        if(ans){
            val += count ;
        }
        return val ;
    }
}