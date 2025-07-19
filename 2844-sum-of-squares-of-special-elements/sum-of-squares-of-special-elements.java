class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length ;
        int count = 0 ;
        for(int i = 1 ; i <= nums.length ;i ++){
            int sum = 0 ;
            if(n%i == 0){
                sum = nums[i-1] ;
            }
            System.out.println(sum + " ") ;
            count += Math.pow(sum , 2) ;
            //System.out.println(sum + " "+ count) ;
        }
        return count ;
    }
}