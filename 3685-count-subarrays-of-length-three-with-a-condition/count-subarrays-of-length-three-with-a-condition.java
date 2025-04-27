class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0 ;
        for(int i = 0 ; i < nums.length-2 ;i ++){
            int num1 = nums[i] ;
            int num2 = nums[i+1] ;
            int num3 = nums[i+2] ;
            if(num1+num3 == num2/2.0){
                count ++ ;
            }
        }
        return count ;
    }
}