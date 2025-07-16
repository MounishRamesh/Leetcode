class Solution {
    public int getMaxLen(int[] nums) {
        int pro = 1 ;
        int neg = 0 ;
        int firneg = -1 ;
        int start = 0 ;
        int max = 0 ;
        for(int i = 0 ;i < nums.length ;i ++){
            if(nums[i] == 0){
                start = i+1 ;
                firneg = -1 ;
                neg = 0 ;
                pro = 1 ;
            }
            else{
                pro *= nums[i] ;
                if(nums[i] < 0){
                    neg ++ ;
                    if(firneg == -1){
                        firneg = i ;
                    }
                }
                if(neg%2 ==0){
                    max = Math.max(max , i-start+1) ;
                }
                else{
                    max = Math.max(max , i-firneg) ;
                }
            }
        }
        return max ;
    }
}