class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count =0 ;
        for(int i = 0 ;i < nums.length-1 ; i ++){
            for(int j = i+1 ;j < nums.length-1 ; j ++){
                if((nums[i+1]-nums[i]) == (nums[j+1]-nums[j])){
                    count ++ ;
                }
                else{
                    break; 
                }
            }
        }
        return count ;
    }
}