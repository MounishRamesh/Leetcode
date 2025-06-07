class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0 ;
        int count= 1 ;
        int pre = nums[0] ;
        for(int i =0  ; i < nums.length ;i ++){
            int curr = nums[i] ;
            if(curr > pre){
                count ++ ;
            }
            else{
                max = Math.max(count , max) ;
                count = 1 ;
            }
            pre = curr ;
        }
        max = Math.max(count , max); 
        return max ;
    }
}