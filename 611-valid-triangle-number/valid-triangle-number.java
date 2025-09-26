class Solution {
    public int triangleNumber(int[] nums) {
        int count = 0 ;
        Arrays.sort(nums) ;
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i+1 ; j < nums.length ;j ++){
                int sum = nums[i]+nums[j] ;
                for(int k = j+1 ; k < nums.length ; k ++){
                    if(sum > nums[k]){
                        count ++ ;
                    }
                }
            }
        }
        return count ;
    }
}