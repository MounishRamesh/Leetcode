class Solution {
    public int arrayPairSum(int[] nums) {
        int count = 0 ;
        Arrays.sort(nums) ;
        for(int i = 0 ;i < nums.length ;i +=2){
            int max = Math.min(nums[i] , nums[i+1] ) ;
            //System.out.println(max) ;
            count += max ;
        }
        return count ;
    }
}