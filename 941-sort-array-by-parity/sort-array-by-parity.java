class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length] ;
        int i1 = 0 ;
        int j = nums.length-1 ;
        for(int i= 0 ;i < nums.length ;i ++){
            if(nums[i] % 2 == 0){
                arr[i1] = nums[i] ;
                i1 ++ ;
            }
            else{
                arr[j] = nums[i] ;
                j -- ;
            }
        }
        return arr ;
    }
}