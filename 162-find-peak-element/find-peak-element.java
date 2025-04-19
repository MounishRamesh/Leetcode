class Solution {
    public int findPeakElement(int[] nums) {
        int count = 0 ;
        int i = 0 ;
        int j = nums.length-1 ;
        while(i <= j ){
            int mid = i + ((j-i)/2) ;
            System.out.print(mid + " ") ;
            if((mid == 0 || nums[mid] > nums[mid-1]) && (mid == nums.length-1 || nums[mid] > nums[mid + 1])){
                System.out.print("H") ;
                return mid ;
            }
            else if(nums[mid] < nums[mid+1]){ 
                i = mid + 1 ;
                 System.out.print(i + " sfgdskf");
            }
            else{
                j = mid -1;
            }
        }
        return 0 ;
    }
}