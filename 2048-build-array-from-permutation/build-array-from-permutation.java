class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length ; 
        int n1 = 0  ;
        int[] arr = new int[n] ; 
        for(int i = 0 ; i < n ; i ++){
            arr[n1] = nums[nums[i]] ; 
            n1 ++ ; 
        }
        return arr ; 
    }
}