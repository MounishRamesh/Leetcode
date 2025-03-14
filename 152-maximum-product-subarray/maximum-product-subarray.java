class Solution {
    public int maxProduct(int[] nums) {
        int lpro = 1 ;
        int rpro = 1 ;
        int max = nums[0] ;
        for(int i= 0 ; i < nums.length ;i ++){
            if(lpro == 0){
                lpro = 1 ;
            }
            if(rpro == 0){
                rpro = 1 ;
            }
            lpro = lpro * nums[i] ;
            rpro = rpro * nums[nums.length-1-i] ;
            max = Math.max(max , Math.max(lpro , rpro)) ;
        }   
        return max ;
    }
}