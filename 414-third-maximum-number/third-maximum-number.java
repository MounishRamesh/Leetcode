class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums) ;
        int value = 0 ;
        int sec = 0 ;
        int ind = 0 ;
        for(int i = nums.length-1; i >= 1; i --){
            if(nums[i] != nums[i-1]){
                sec = nums[i-1] ;
                ind = i-1 ;
                break ;
            }
        }
        int max = nums[nums.length-1] ;
        for(int i = ind; i >= 0; i --){
            System.out.print(sec + " " + nums[i]) ;
            if(sec > nums[i]){
                value = nums[i] ;
                return value ;
            }
        }
        return max ;
    }
}