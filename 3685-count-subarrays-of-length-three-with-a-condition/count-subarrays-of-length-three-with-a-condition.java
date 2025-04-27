class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0 ;
        for(int i = 0 ;i < nums.length-2 ;i ++){
            int sum = 0 ;
            int half = 0 ;
            for(int j = i ;j < i+3 ;j ++){
                if(j == i || j ==i+2){
                    sum += (nums[j]) ;
                }
                else{
                    half += (nums[j]) ;
                }
            }
            if(half/2.0 == sum){
                count ++ ;
            }
        }
        return count ;
    }
}