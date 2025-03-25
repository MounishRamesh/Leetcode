class Solution {
    public int findNumbers(int[] nums) {
        int count = 0 ;
        for(int i = 0 ; i < nums.length; i ++){
            int sum = 0 ;
            int a = nums[i] ;
            while(a > 0){
                int rem = a % 10 ;
                a/= 10 ;
                sum ++ ;
            }
            if(sum % 2 == 0){
                count ++ ;
            }
        }
        return count  ;
    }
}