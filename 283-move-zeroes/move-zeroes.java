class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0 ;
        int j = 0 ;
        while(i < nums.length && j < nums.length){
            if(nums[i] != 0){
                int temp = nums[i] ;
                nums[i] = nums[j] ;
                nums[j] = temp ;
                i ++ ;
                j ++ ;
            }
            else{
                i ++ ;
            }
        }
    }
}