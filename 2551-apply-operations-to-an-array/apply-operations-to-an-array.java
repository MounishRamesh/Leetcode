class Solution {
    public int[] applyOperations(int[] nums) {
        boolean val = false ;
        for(int i = 0 ;i < nums.length-1; i ++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2 ;
                nums[i+1] = 0 ;
            }
        }
        int[] arr2 = new int[nums.length] ;
        int j = 0 ;
        for(int i = 0 ;i < nums.length ;i ++){
            if(nums[i] != 0){
                arr2[j] = nums[i]; 
                j ++ ;
            }
        }
        return arr2; 
    }
}