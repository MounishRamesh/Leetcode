class Solution {
    public int largestPerimeter(int[] nums) {
        int count = 0 ;
        Arrays.sort(nums) ;
        int j = nums.length-1 ;
        while(j >= 2){
            int sum = nums[j-1]+nums[j-2] ;
            System.out.println(sum) ;
            if(sum > nums[j]){
                count = nums[j-1]+nums[j-2]+nums[j] ;
                break ;
            }
            j -- ;
        }
        return count ;
    }
}